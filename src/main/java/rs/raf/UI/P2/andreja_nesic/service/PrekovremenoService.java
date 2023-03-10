package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Prekovremeno;
import rs.raf.UI.P2.andreja_nesic.model.dto.PrekovremenoDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.PrekovremenoMapper;
import rs.raf.UI.P2.andreja_nesic.repository.PrekovremenoRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class PrekovremenoService {
    private final PrekovremenoRepository repository;
    private final PrekovremenoMapper prekovremenoMapper;

    public PrekovremenoService(PrekovremenoRepository repository, PrekovremenoMapper prekovremenoMapper) {
        this.repository = repository;
        this.prekovremenoMapper = prekovremenoMapper;
    }

    public PrekovremenoDto save(PrekovremenoDto prekovremenoDto) {
        Prekovremeno entity = prekovremenoMapper.toEntity(prekovremenoDto);
        return prekovremenoMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public PrekovremenoDto findById(int id) {
        if (repository.findById(id).isPresent())
            return prekovremenoMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<PrekovremenoDto> findByCondition(PrekovremenoDto prekovremenoDto, Pageable pageable) {
        Page<Prekovremeno> entityPage = repository.findAll(pageable);
        List<Prekovremeno> entities = entityPage.getContent();
        return new PageImpl<>(prekovremenoMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public PrekovremenoDto update(PrekovremenoDto prekovremenoDto, int id) {
        PrekovremenoDto data = findById(id);
        if (data == null) return null;
        Prekovremeno entity = prekovremenoMapper.toEntity(prekovremenoDto);
        BeanUtils.copyProperties(data, entity);
        return save(prekovremenoMapper.toDto(entity));
    }
}