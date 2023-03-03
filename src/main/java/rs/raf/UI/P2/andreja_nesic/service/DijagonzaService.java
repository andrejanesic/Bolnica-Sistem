package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Dijagonza;
import rs.raf.UI.P2.andreja_nesic.model.dto.DijagonzaDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.DijagonzaMapper;
import rs.raf.UI.P2.andreja_nesic.repository.DijagonzaRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class DijagonzaService {
    private final DijagonzaRepository repository;
    private final DijagonzaMapper dijagonzaMapper;

    public DijagonzaService(DijagonzaRepository repository, DijagonzaMapper dijagonzaMapper) {
        this.repository = repository;
        this.dijagonzaMapper = dijagonzaMapper;
    }

    public DijagonzaDto save(DijagonzaDto dijagonzaDto) {
        Dijagonza entity = dijagonzaMapper.toEntity(dijagonzaDto);
        return dijagonzaMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public DijagonzaDto findById(int id) {
        if (repository.findById(id).isPresent())
            return dijagonzaMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<DijagonzaDto> findByCondition(DijagonzaDto dijagonzaDto, Pageable pageable) {
        Page<Dijagonza> entityPage = repository.findAll(pageable);
        List<Dijagonza> entities = entityPage.getContent();
        return new PageImpl<>(dijagonzaMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public DijagonzaDto update(DijagonzaDto dijagonzaDto, int id) {
        DijagonzaDto data = findById(id);
        if (data == null) return null;
        Dijagonza entity = dijagonzaMapper.toEntity(dijagonzaDto);
        BeanUtils.copyProperties(data, entity);
        return save(dijagonzaMapper.toDto(entity));
    }
}