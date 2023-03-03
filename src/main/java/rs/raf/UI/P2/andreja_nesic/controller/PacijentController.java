package rs.raf.UI.P2.andreja_nesic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.UI.P2.andreja_nesic.model.dto.PacijentDto;
import rs.raf.UI.P2.andreja_nesic.service.PacijentService;

@RequestMapping("/pacijent")
@RestController
@Slf4j
public class PacijentController {
    private final PacijentService pacijentService;

    public PacijentController(PacijentService pacijentService) {
        this.pacijentService = pacijentService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated PacijentDto pacijentDto) {
        pacijentService.save(pacijentDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacijentDto> findById(@PathVariable("id") int id) {
        PacijentDto pacijent = pacijentService.findById(id);
        return ResponseEntity.ok(pacijent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        pacijentService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<PacijentDto>> pageQuery(PacijentDto pacijentDto, @PageableDefault() Pageable pageable) {
        Page<PacijentDto> pacijentPage = pacijentService.findByCondition(pacijentDto, pageable);
        return ResponseEntity.ok(pacijentPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated PacijentDto pacijentDto, @PathVariable("id") int id) {
        pacijentService.update(pacijentDto, id);
        return ResponseEntity.ok().build();
    }
}