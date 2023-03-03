package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Odeljenje;
import rs.raf.UI.P2.andreja_nesic.model.dto.OdeljenjeDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.OdeljenjeMapper;
import rs.raf.UI.P2.andreja_nesic.repository.OdeljenjeRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class OdeljenjeService {
    private final OdeljenjeRepository repository;
    private final OdeljenjeMapper odeljenjeMapper;

    public OdeljenjeService(OdeljenjeRepository repository, OdeljenjeMapper odeljenjeMapper) {
        this.repository = repository;
        this.odeljenjeMapper = odeljenjeMapper;
    }

    public OdeljenjeDto save(OdeljenjeDto odeljenjeDto) {
        Odeljenje entity = odeljenjeMapper.toEntity(odeljenjeDto);
        return odeljenjeMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public OdeljenjeDto findById(int id) {
        if (repository.findById(id).isPresent())
            return odeljenjeMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<OdeljenjeDto> findByCondition(OdeljenjeDto odeljenjeDto, Pageable pageable) {
        Page<Odeljenje> entityPage = repository.findAll(pageable);
        List<Odeljenje> entities = entityPage.getContent();
        return new PageImpl<>(odeljenjeMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public OdeljenjeDto update(OdeljenjeDto odeljenjeDto, int id) {
        OdeljenjeDto data = findById(id);
        if (data == null) return null;
        Odeljenje entity = odeljenjeMapper.toEntity(odeljenjeDto);
        BeanUtils.copyProperties(data, entity);
        return save(odeljenjeMapper.toDto(entity));
    }
}