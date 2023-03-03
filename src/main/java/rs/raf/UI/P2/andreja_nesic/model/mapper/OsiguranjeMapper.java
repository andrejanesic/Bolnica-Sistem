package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Osiguranje;
import rs.raf.UI.P2.andreja_nesic.model.dto.OsiguranjeDto;

@Repository
@Mapper(componentModel = "spring")
public interface OsiguranjeMapper extends EntityMapper<OsiguranjeDto, Osiguranje> {
}