package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Obuka;
import rs.raf.UI.P2.andreja_nesic.model.dto.ObukaDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.ObukaMapper;
import rs.raf.UI.P2.andreja_nesic.repository.ObukaRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class ObukaService {
    private final ObukaRepository repository;
    private final ObukaMapper obukaMapper;

    public ObukaService(ObukaRepository repository, ObukaMapper obukaMapper) {
        this.repository = repository;
        this.obukaMapper = obukaMapper;
    }

    public ObukaDto save(ObukaDto obukaDto) {
        Obuka entity = obukaMapper.toEntity(obukaDto);
        return obukaMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public ObukaDto findById(int id) {
        if (repository.findById(id).isPresent())
            return obukaMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<ObukaDto> findByCondition(ObukaDto obukaDto, Pageable pageable) {
        Page<Obuka> entityPage = repository.findAll(pageable);
        List<Obuka> entities = entityPage.getContent();
        return new PageImpl<>(obukaMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public ObukaDto update(ObukaDto obukaDto, int id) {
        ObukaDto data = findById(id);
        if (data == null) return null;
        Obuka entity = obukaMapper.toEntity(obukaDto);
        BeanUtils.copyProperties(data, entity);
        return save(obukaMapper.toDto(entity));
    }
}