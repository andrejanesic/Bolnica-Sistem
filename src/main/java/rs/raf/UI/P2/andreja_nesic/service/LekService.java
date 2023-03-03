package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Lek;
import rs.raf.UI.P2.andreja_nesic.model.dto.LekDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.LekMapper;
import rs.raf.UI.P2.andreja_nesic.repository.LekRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class LekService {
    private final LekRepository repository;
    private final LekMapper lekMapper;

    public LekService(LekRepository repository, LekMapper lekMapper) {
        this.repository = repository;
        this.lekMapper = lekMapper;
    }

    public LekDto save(LekDto lekDto) {
        Lek entity = lekMapper.toEntity(lekDto);
        return lekMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public LekDto findById(int id) {
        if (repository.findById(id).isPresent())
            return lekMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<LekDto> findByCondition(LekDto lekDto, Pageable pageable) {
        Page<Lek> entityPage = repository.findAll(pageable);
        List<Lek> entities = entityPage.getContent();
        return new PageImpl<>(lekMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public LekDto update(LekDto lekDto, int id) {
        LekDto data = findById(id);
        if (data == null) return null;
        Lek entity = lekMapper.toEntity(lekDto);
        BeanUtils.copyProperties(data, entity);
        return save(lekMapper.toDto(entity));
    }
}