package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Osiguranje;
import rs.raf.UI.P2.andreja_nesic.model.dto.OsiguranjeDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.OsiguranjeMapper;
import rs.raf.UI.P2.andreja_nesic.repository.OsiguranjeRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class OsiguranjeService {
    private final OsiguranjeRepository repository;
    private final OsiguranjeMapper osiguranjeMapper;

    public OsiguranjeService(OsiguranjeRepository repository, OsiguranjeMapper osiguranjeMapper) {
        this.repository = repository;
        this.osiguranjeMapper = osiguranjeMapper;
    }

    public OsiguranjeDto save(OsiguranjeDto osiguranjeDto) {
        Osiguranje entity = osiguranjeMapper.toEntity(osiguranjeDto);
        return osiguranjeMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public OsiguranjeDto findById(int id) {
        if (repository.findById(id).isPresent())
            return osiguranjeMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<OsiguranjeDto> findByCondition(OsiguranjeDto osiguranjeDto, Pageable pageable) {
        Page<Osiguranje> entityPage = repository.findAll(pageable);
        List<Osiguranje> entities = entityPage.getContent();
        return new PageImpl<>(osiguranjeMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public OsiguranjeDto update(OsiguranjeDto osiguranjeDto, int id) {
        OsiguranjeDto data = findById(id);
        if (data == null) return null;
        Osiguranje entity = osiguranjeMapper.toEntity(osiguranjeDto);
        BeanUtils.copyProperties(data, entity);
        return save(osiguranjeMapper.toDto(entity));
    }
}