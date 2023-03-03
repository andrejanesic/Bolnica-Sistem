package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.OdmorDto;
import rs.raf.UI.P2.andreja_nesic.service.OdmorService;

@RequestMapping("/odmor")
@RestController
@Slf4j
public class OdmorController {
    private final OdmorService odmorService;

    public OdmorController(OdmorService odmorService) {
        this.odmorService = odmorService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated OdmorDto odmorDto) {
        odmorService.save(odmorDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OdmorDto> findById(@PathVariable("id") int id) {
        OdmorDto odmor = odmorService.findById(id);
        return ResponseEntity.ok(odmor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        odmorService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<OdmorDto>> pageQuery(OdmorDto odmorDto, @PageableDefault() Pageable pageable) {
        Page<OdmorDto> odmorPage = odmorService.findByCondition(odmorDto, pageable);
        return ResponseEntity.ok(odmorPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated OdmorDto odmorDto, @PathVariable("id") int id) {
        odmorService.update(odmorDto, id);
        return ResponseEntity.ok().build();
    }
}