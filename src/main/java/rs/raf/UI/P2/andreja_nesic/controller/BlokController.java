package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.BlokDto;
import rs.raf.UI.P2.andreja_nesic.service.BlokService;

@RequestMapping("/blok")
@RestController
@Slf4j
public class BlokController {
    private final BlokService blokService;

    public BlokController(BlokService blokService) {
        this.blokService = blokService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated BlokDto blokDto) {
        blokService.save(blokDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BlokDto> findById(@PathVariable("id") int id) {
        BlokDto blok = blokService.findById(id);
        return ResponseEntity.ok(blok);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        blokService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<BlokDto>> pageQuery(BlokDto blokDto, @PageableDefault() Pageable pageable) {
        Page<BlokDto> blokPage = blokService.findByCondition(blokDto, pageable);
        return ResponseEntity.ok(blokPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated BlokDto blokDto, @PathVariable("id") int id) {
        blokService.update(blokDto, id);
        return ResponseEntity.ok().build();
    }
}