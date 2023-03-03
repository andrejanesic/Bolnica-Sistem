package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Covid;
import rs.raf.UI.P2.andreja_nesic.model.dto.CovidDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.CovidMapper;
import rs.raf.UI.P2.andreja_nesic.repository.CovidRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class CovidService {
    private final CovidRepository repository;
    private final CovidMapper covidMapper;

    public CovidService(CovidRepository repository, CovidMapper covidMapper) {
        this.repository = repository;
        this.covidMapper = covidMapper;
    }

    public CovidDto save(CovidDto covidDto) {
        Covid entity = covidMapper.toEntity(covidDto);
        return covidMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public CovidDto findById(int id) {
        if (repository.findById(id).isPresent())
            return covidMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<CovidDto> findByCondition(CovidDto covidDto, Pageable pageable) {
        Page<Covid> entityPage = repository.findAll(pageable);
        List<Covid> entities = entityPage.getContent();
        return new PageImpl<>(covidMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public CovidDto update(CovidDto covidDto, int id) {
        CovidDto data = findById(id);
        if (data == null) return null;
        Covid entity = covidMapper.toEntity(covidDto);
        BeanUtils.copyProperties(data, entity);
        return save(covidMapper.toDto(entity));
    }
}