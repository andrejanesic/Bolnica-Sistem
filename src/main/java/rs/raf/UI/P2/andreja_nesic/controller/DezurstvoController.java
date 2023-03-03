package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.DezurstvoDto;
import rs.raf.UI.P2.andreja_nesic.service.DezurstvoService;

@RequestMapping("/dezurstvo")
@RestController
@Slf4j
public class DezurstvoController {
    private final DezurstvoService dezurstvoService;

    public DezurstvoController(DezurstvoService dezurstvoService) {
        this.dezurstvoService = dezurstvoService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated DezurstvoDto dezurstvoDto) {
        dezurstvoService.save(dezurstvoDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DezurstvoDto> findById(@PathVariable("id") int id) {
        DezurstvoDto dezurstvo = dezurstvoService.findById(id);
        return ResponseEntity.ok(dezurstvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        dezurstvoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<DezurstvoDto>> pageQuery(DezurstvoDto dezurstvoDto, @PageableDefault() Pageable pageable) {
        Page<DezurstvoDto> dezurstvoPage = dezurstvoService.findByCondition(dezurstvoDto, pageable);
        return ResponseEntity.ok(dezurstvoPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated DezurstvoDto dezurstvoDto, @PathVariable("id") int id) {
        dezurstvoService.update(dezurstvoDto, id);
        return ResponseEntity.ok().build();
    }
}