package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Prijem;
import rs.raf.UI.P2.andreja_nesic.model.dto.PrijemDto;

@Repository
@Mapper(componentModel = "spring")
public interface PrijemMapper extends EntityMapper<PrijemDto, Prijem> {
}