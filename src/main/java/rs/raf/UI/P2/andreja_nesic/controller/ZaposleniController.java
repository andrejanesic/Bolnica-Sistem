package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.ZaposleniDto;
import rs.raf.UI.P2.andreja_nesic.service.ZaposleniService;

@RequestMapping("/zaposleni")
@RestController
@Slf4j
public class ZaposleniController {
    private final ZaposleniService zaposleniService;

    public ZaposleniController(ZaposleniService zaposleniService) {
        this.zaposleniService = zaposleniService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated ZaposleniDto zaposleniDto) {
        zaposleniService.save(zaposleniDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ZaposleniDto> findById(@PathVariable("id") int id) {
        ZaposleniDto zaposleni = zaposleniService.findById(id);
        return ResponseEntity.ok(zaposleni);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        zaposleniService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<ZaposleniDto>> pageQuery(ZaposleniDto zaposleniDto, @PageableDefault() Pageable pageable) {
        Page<ZaposleniDto> zaposleniPage = zaposleniService.findByCondition(zaposleniDto, pageable);
        return ResponseEntity.ok(zaposleniPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated ZaposleniDto zaposleniDto, @PathVariable("id") int id) {
        zaposleniService.update(zaposleniDto, id);
        return ResponseEntity.ok().build();
    }
}