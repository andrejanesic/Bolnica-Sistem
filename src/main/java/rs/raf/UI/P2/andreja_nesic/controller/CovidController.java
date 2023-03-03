package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.CovidDto;
import rs.raf.UI.P2.andreja_nesic.service.CovidService;

@RequestMapping("/covid")
@RestController
@Slf4j
public class CovidController {
    private final CovidService covidService;

    public CovidController(CovidService covidService) {
        this.covidService = covidService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated CovidDto covidDto) {
        covidService.save(covidDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CovidDto> findById(@PathVariable("id") int id) {
        CovidDto covid = covidService.findById(id);
        return ResponseEntity.ok(covid);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        covidService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<CovidDto>> pageQuery(CovidDto covidDto, @PageableDefault() Pageable pageable) {
        Page<CovidDto> covidPage = covidService.findByCondition(covidDto, pageable);
        return ResponseEntity.ok(covidPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated CovidDto covidDto, @PathVariable("id") int id) {
        covidService.update(covidDto, id);
        return ResponseEntity.ok().build();
    }
}