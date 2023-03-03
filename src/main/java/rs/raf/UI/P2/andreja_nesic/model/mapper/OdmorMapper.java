package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Odmor;
import rs.raf.UI.P2.andreja_nesic.model.dto.OdmorDto;

@Repository
@Mapper(componentModel = "spring")
public interface OdmorMapper extends EntityMapper<OdmorDto, Odmor> {
}