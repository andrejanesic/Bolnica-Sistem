package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Procedura;
import rs.raf.UI.P2.andreja_nesic.model.dto.ProceduraDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.ProceduraMapper;
import rs.raf.UI.P2.andreja_nesic.repository.ProceduraRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class ProceduraService {
    private final ProceduraRepository repository;
    private final ProceduraMapper proceduraMapper;

    public ProceduraService(ProceduraRepository repository, ProceduraMapper proceduraMapper) {
        this.repository = repository;
        this.proceduraMapper = proceduraMapper;
    }

    public ProceduraDto save(ProceduraDto proceduraDto) {
        Procedura entity = proceduraMapper.toEntity(proceduraDto);
        return proceduraMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public ProceduraDto findById(int id) {
        if (repository.findById(id).isPresent())
            return proceduraMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<ProceduraDto> findByCondition(ProceduraDto proceduraDto, Pageable pageable) {
        Page<Procedura> entityPage = repository.findAll(pageable);
        List<Procedura> entities = entityPage.getContent();
        return new PageImpl<>(proceduraMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public ProceduraDto update(ProceduraDto proceduraDto, int id) {
        ProceduraDto data = findById(id);
        if (data == null) return null;
        Procedura entity = proceduraMapper.toEntity(proceduraDto);
        BeanUtils.copyProperties(data, entity);
        return save(proceduraMapper.toDto(entity));
    }
}