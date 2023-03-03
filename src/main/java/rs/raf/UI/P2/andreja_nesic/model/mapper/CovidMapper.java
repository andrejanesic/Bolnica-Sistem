package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Covid;
import rs.raf.UI.P2.andreja_nesic.model.dto.CovidDto;

@Repository
@Mapper(componentModel = "spring")
public interface CovidMapper extends EntityMapper<CovidDto, Covid> {
}