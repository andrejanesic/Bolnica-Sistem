package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Recept;
import rs.raf.UI.P2.andreja_nesic.model.dto.ReceptDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.ReceptMapper;
import rs.raf.UI.P2.andreja_nesic.repository.ReceptRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class ReceptService {
    private final ReceptRepository repository;
    private final ReceptMapper receptMapper;

    public ReceptService(ReceptRepository repository, ReceptMapper receptMapper) {
        this.repository = repository;
        this.receptMapper = receptMapper;
    }

    public ReceptDto save(ReceptDto receptDto) {
        Recept entity = receptMapper.toEntity(receptDto);
        return receptMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public ReceptDto findById(int id) {
        if (repository.findById(id).isPresent())
            return receptMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<ReceptDto> findByCondition(ReceptDto receptDto, Pageable pageable) {
        Page<Recept> entityPage = repository.findAll(pageable);
        List<Recept> entities = entityPage.getContent();
        return new PageImpl<>(receptMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public ReceptDto update(ReceptDto receptDto, int id) {
        ReceptDto data = findById(id);
        if (data == null) return null;
        Recept entity = receptMapper.toEntity(receptDto);
        BeanUtils.copyProperties(data, entity);
        return save(receptMapper.toDto(entity));
    }
}