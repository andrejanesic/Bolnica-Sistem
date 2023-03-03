package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.SobaDto;
import rs.raf.UI.P2.andreja_nesic.service.SobaService;

@RequestMapping("/soba")
@RestController
@Slf4j
public class SobaController {
    private final SobaService sobaService;

    public SobaController(SobaService sobaService) {
        this.sobaService = sobaService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated SobaDto sobaDto) {
        sobaService.save(sobaDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SobaDto> findById(@PathVariable("id") int id) {
        SobaDto soba = sobaService.findById(id);
        return ResponseEntity.ok(soba);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        sobaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<SobaDto>> pageQuery(SobaDto sobaDto, @PageableDefault() Pageable pageable) {
        Page<SobaDto> sobaPage = sobaService.findByCondition(sobaDto, pageable);
        return ResponseEntity.ok(sobaPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated SobaDto sobaDto, @PathVariable("id") int id) {
        sobaService.update(sobaDto, id);
        return ResponseEntity.ok().build();
    }
}