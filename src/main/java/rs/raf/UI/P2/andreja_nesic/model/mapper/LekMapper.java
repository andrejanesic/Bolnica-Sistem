package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Lek;
import rs.raf.UI.P2.andreja_nesic.model.dto.LekDto;

@Repository
@Mapper(componentModel = "spring")
public interface LekMapper extends EntityMapper<LekDto, Lek> {
}