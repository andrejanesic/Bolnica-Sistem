package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.ProceduraDto;
import rs.raf.UI.P2.andreja_nesic.service.ProceduraService;

@RequestMapping("/procedura")
@RestController
@Slf4j
public class ProceduraController {
    private final ProceduraService proceduraService;

    public ProceduraController(ProceduraService proceduraService) {
        this.proceduraService = proceduraService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated ProceduraDto proceduraDto) {
        proceduraService.save(proceduraDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProceduraDto> findById(@PathVariable("id") int id) {
        ProceduraDto procedura = proceduraService.findById(id);
        return ResponseEntity.ok(procedura);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        proceduraService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<ProceduraDto>> pageQuery(ProceduraDto proceduraDto, @PageableDefault() Pageable pageable) {
        Page<ProceduraDto> proceduraPage = proceduraService.findByCondition(proceduraDto, pageable);
        return ResponseEntity.ok(proceduraPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated ProceduraDto proceduraDto, @PathVariable("id") int id) {
        proceduraService.update(proceduraDto, id);
        return ResponseEntity.ok().build();
    }
}