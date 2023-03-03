package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.LekDto;
import rs.raf.UI.P2.andreja_nesic.service.LekService;

@RequestMapping("/lek")
@RestController
@Slf4j
public class LekController {
    private final LekService lekService;

    public LekController(LekService lekService) {
        this.lekService = lekService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated LekDto lekDto) {
        lekService.save(lekDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LekDto> findById(@PathVariable("id") int id) {
        LekDto lek = lekService.findById(id);
        return ResponseEntity.ok(lek);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        lekService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<LekDto>> pageQuery(LekDto lekDto, @PageableDefault() Pageable pageable) {
        Page<LekDto> lekPage = lekService.findByCondition(lekDto, pageable);
        return ResponseEntity.ok(lekPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated LekDto lekDto, @PathVariable("id") int id) {
        lekService.update(lekDto, id);
        return ResponseEntity.ok().build();
    }
}