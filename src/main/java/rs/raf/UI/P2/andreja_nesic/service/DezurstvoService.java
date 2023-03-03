package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Dezurstvo;
import rs.raf.UI.P2.andreja_nesic.model.dto.DezurstvoDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.DezurstvoMapper;
import rs.raf.UI.P2.andreja_nesic.repository.DezurstvoRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class DezurstvoService {
    private final DezurstvoRepository repository;
    private final DezurstvoMapper dezurstvoMapper;

    public DezurstvoService(DezurstvoRepository repository, DezurstvoMapper dezurstvoMapper) {
        this.repository = repository;
        this.dezurstvoMapper = dezurstvoMapper;
    }

    public DezurstvoDto save(DezurstvoDto dezurstvoDto) {
        Dezurstvo entity = dezurstvoMapper.toEntity(dezurstvoDto);
        return dezurstvoMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public DezurstvoDto findById(int id) {
        if (repository.findById(id).isPresent())
            return dezurstvoMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<DezurstvoDto> findByCondition(DezurstvoDto dezurstvoDto, Pageable pageable) {
        Page<Dezurstvo> entityPage = repository.findAll(pageable);
        List<Dezurstvo> entities = entityPage.getContent();
        return new PageImpl<>(dezurstvoMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public DezurstvoDto update(DezurstvoDto dezurstvoDto, int id) {
        DezurstvoDto data = findById(id);
        if (data == null) return null;
        Dezurstvo entity = dezurstvoMapper.toEntity(dezurstvoDto);
        BeanUtils.copyProperties(data, entity);
        return save(dezurstvoMapper.toDto(entity));
    }
}