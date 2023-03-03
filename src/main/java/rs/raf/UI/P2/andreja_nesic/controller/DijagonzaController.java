package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.DijagonzaDto;
import rs.raf.UI.P2.andreja_nesic.service.DijagonzaService;

@RequestMapping("/dijagonza")
@RestController
@Slf4j
public class DijagonzaController {
    private final DijagonzaService dijagonzaService;

    public DijagonzaController(DijagonzaService dijagonzaService) {
        this.dijagonzaService = dijagonzaService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated DijagonzaDto dijagonzaDto) {
        dijagonzaService.save(dijagonzaDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DijagonzaDto> findById(@PathVariable("id") int id) {
        DijagonzaDto dijagonza = dijagonzaService.findById(id);
        return ResponseEntity.ok(dijagonza);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        dijagonzaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<DijagonzaDto>> pageQuery(DijagonzaDto dijagonzaDto, @PageableDefault() Pageable pageable) {
        Page<DijagonzaDto> dijagonzaPage = dijagonzaService.findByCondition(dijagonzaDto, pageable);
        return ResponseEntity.ok(dijagonzaPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated DijagonzaDto dijagonzaDto, @PathVariable("id") int id) {
        dijagonzaService.update(dijagonzaDto, id);
        return ResponseEntity.ok().build();
    }
}