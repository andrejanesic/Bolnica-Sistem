package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.PrijemDto;
import rs.raf.UI.P2.andreja_nesic.service.PrijemService;

@RequestMapping("/prijem")
@RestController
@Slf4j
public class PrijemController {
    private final PrijemService prijemService;

    public PrijemController(PrijemService prijemService) {
        this.prijemService = prijemService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated PrijemDto prijemDto) {
        prijemService.save(prijemDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrijemDto> findById(@PathVariable("id") int id) {
        PrijemDto prijem = prijemService.findById(id);
        return ResponseEntity.ok(prijem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        prijemService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<PrijemDto>> pageQuery(PrijemDto prijemDto, @PageableDefault() Pageable pageable) {
        Page<PrijemDto> prijemPage = prijemService.findByCondition(prijemDto, pageable);
        return ResponseEntity.ok(prijemPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated PrijemDto prijemDto, @PathVariable("id") int id) {
        prijemService.update(prijemDto, id);
        return ResponseEntity.ok().build();
    }
}