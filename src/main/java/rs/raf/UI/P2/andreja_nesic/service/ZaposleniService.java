package rs.raf.UI.P2.andreja_nesic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.model.Zaposleni;
import rs.raf.UI.P2.andreja_nesic.model.dto.ZaposleniDto;
import rs.raf.UI.P2.andreja_nesic.model.mapper.ZaposleniMapper;
import rs.raf.UI.P2.andreja_nesic.repository.ZaposleniRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class ZaposleniService {
    private final ZaposleniRepository repository;
    private final ZaposleniMapper zaposleniMapper;

    public ZaposleniService(ZaposleniRepository repository, ZaposleniMapper zaposleniMapper) {
        this.repository = repository;
        this.zaposleniMapper = zaposleniMapper;
    }

    public ZaposleniDto save(ZaposleniDto zaposleniDto) {
        Zaposleni entity = zaposleniMapper.toEntity(zaposleniDto);
        return zaposleniMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        if (repository.findById(id).isPresent()) repository.deleteById(id);
    }

    public ZaposleniDto findById(int id) {
        if (repository.findById(id).isPresent())
            return zaposleniMapper.toDto(repository.findById(id).get());
        return null;
    }

    public Page<ZaposleniDto> findByCondition(ZaposleniDto zaposleniDto, Pageable pageable) {
        Page<Zaposleni> entityPage = repository.findAll(pageable);
        List<Zaposleni> entities = entityPage.getContent();
        return new PageImpl<>(zaposleniMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public ZaposleniDto update(ZaposleniDto zaposleniDto, int id) {
        ZaposleniDto data = findById(id);
        if (data == null) return null;
        Zaposleni entity = zaposleniMapper.toEntity(zaposleniDto);
        BeanUtils.copyProperties(data, entity);
        return save(zaposleniMapper.toDto(entity));
    }
}