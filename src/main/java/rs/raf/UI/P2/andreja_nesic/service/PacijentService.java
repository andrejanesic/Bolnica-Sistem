package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Pacijent;
import rs.raf.UI.P2.andreja_nesic.model.dto.PacijentDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.PacijentMapper;
import rs.raf.UI.P2.andreja_nesic.repository.PacijentRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class PacijentService {
    private final PacijentRepository repository;
    private final PacijentMapper pacijentMapper;

    public PacijentService(PacijentRepository repository, PacijentMapper pacijentMapper) {
        this.repository = repository;
        this.pacijentMapper = pacijentMapper;
    }

    public PacijentDto save(PacijentDto pacijentDto) {
        Pacijent entity = pacijentMapper.toEntity(pacijentDto);
        return pacijentMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public PacijentDto findById(int id) {
        if (repository.findById(id).isPresent())
            return pacijentMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<PacijentDto> findByCondition(PacijentDto pacijentDto, Pageable pageable) {
        Page<Pacijent> entityPage = repository.findAll(pageable);
        List<Pacijent> entities = entityPage.getContent();
        return new PageImpl<>(pacijentMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public PacijentDto update(PacijentDto pacijentDto, int id) {
        PacijentDto data = findById(id);
        if (data == null) return null;
        Pacijent entity = pacijentMapper.toEntity(pacijentDto);
        BeanUtils.copyProperties(data, entity);
        return save(pacijentMapper.toDto(entity));
    }
}