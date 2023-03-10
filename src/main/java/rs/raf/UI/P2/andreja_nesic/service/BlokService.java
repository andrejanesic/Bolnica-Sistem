package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.dto.BlokDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.BlokMapper;
import rs.raf.UI.P2.andreja_nesic.model.Blok;
import rs.raf.UI.P2.andreja_nesic.repository.BlokRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class BlokService {

    private final BlokRepository repository;
    private final BlokMapper blokMapper;

    public BlokService(BlokRepository repository, BlokMapper blokMapper) {
        this.repository = repository;
        this.blokMapper = blokMapper;
    }

    public BlokDto save(BlokDto blokDto) {
        Blok entity = blokMapper.toEntity(blokDto);
        return blokMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public BlokDto findById(int id) {
        if (repository.findById(id).isPresent())
            return blokMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<BlokDto> findByCondition(BlokDto blokDto, Pageable pageable) {
        Page<Blok> entityPage = repository.findAll(pageable);
        List<Blok> entities = entityPage.getContent();
        return new PageImpl<>(blokMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public BlokDto update(BlokDto blokDto, int id) {
        BlokDto data = findById(id);
        if (data == null) return null;
        Blok entity = blokMapper.toEntity(blokDto);
        BeanUtils.copyProperties(data, entity);
        return save(blokMapper.toDto(entity));
    }
}