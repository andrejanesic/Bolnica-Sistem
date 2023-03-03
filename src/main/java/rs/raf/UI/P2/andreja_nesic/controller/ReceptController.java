package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.ReceptDto;
import rs.raf.UI.P2.andreja_nesic.service.ReceptService;

@RequestMapping("/recept")
@RestController
@Slf4j
public class ReceptController {
    private final ReceptService receptService;

    public ReceptController(ReceptService receptService) {
        this.receptService = receptService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated ReceptDto receptDto) {
        receptService.save(receptDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReceptDto> findById(@PathVariable("id") int id) {
        ReceptDto recept = receptService.findById(id);
        return ResponseEntity.ok(recept);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        receptService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<ReceptDto>> pageQuery(ReceptDto receptDto, @PageableDefault() Pageable pageable) {
        Page<ReceptDto> receptPage = receptService.findByCondition(receptDto, pageable);
        return ResponseEntity.ok(receptPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated ReceptDto receptDto, @PathVariable("id") int id) {
        receptService.update(receptDto, id);
        return ResponseEntity.ok().build();
    }
}