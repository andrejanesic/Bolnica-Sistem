package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Soba;
import rs.raf.UI.P2.andreja_nesic.model.dto.SobaDto;

@Repository
@Mapper(componentModel = "spring")
public interface SobaMapper extends EntityMapper<SobaDto, Soba> {
}