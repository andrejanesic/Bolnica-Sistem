package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.ObukaDto;
import rs.raf.UI.P2.andreja_nesic.service.ObukaService;

@RequestMapping("/obuka")
@RestController
@Slf4j
public class ObukaController {
    private final ObukaService obukaService;

    public ObukaController(ObukaService obukaService) {
        this.obukaService = obukaService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated ObukaDto obukaDto) {
        obukaService.save(obukaDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ObukaDto> findById(@PathVariable("id") int id) {
        ObukaDto obuka = obukaService.findById(id);
        return ResponseEntity.ok(obuka);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        obukaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<ObukaDto>> pageQuery(ObukaDto obukaDto, @PageableDefault() Pageable pageable) {
        Page<ObukaDto> obukaPage = obukaService.findByCondition(obukaDto, pageable);
        return ResponseEntity.ok(obukaPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated ObukaDto obukaDto, @PathVariable("id") int id) {
        obukaService.update(obukaDto, id);
        return ResponseEntity.ok().build();
    }
}