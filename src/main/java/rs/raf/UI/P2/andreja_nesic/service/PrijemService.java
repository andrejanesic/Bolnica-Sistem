package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Prijem;
import rs.raf.UI.P2.andreja_nesic.model.dto.PrijemDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.PrijemMapper;
import rs.raf.UI.P2.andreja_nesic.repository.PrijemRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class PrijemService {
    private final PrijemRepository repository;
    private final PrijemMapper prijemMapper;

    public PrijemService(PrijemRepository repository, PrijemMapper prijemMapper) {
        this.repository = repository;
        this.prijemMapper = prijemMapper;
    }

    public PrijemDto save(PrijemDto prijemDto) {
        Prijem entity = prijemMapper.toEntity(prijemDto);
        return prijemMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public PrijemDto findById(int id) {
        if (repository.findById(id).isPresent())
            return prijemMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<PrijemDto> findByCondition(PrijemDto prijemDto, Pageable pageable) {
        Page<Prijem> entityPage = repository.findAll(pageable);
        List<Prijem> entities = entityPage.getContent();
        return new PageImpl<>(prijemMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public PrijemDto update(PrijemDto prijemDto, int id) {
        PrijemDto data = findById(id);
        if (data == null) return null;
        Prijem entity = prijemMapper.toEntity(prijemDto);
        BeanUtils.copyProperties(data, entity);
        return save(prijemMapper.toDto(entity));
    }
}