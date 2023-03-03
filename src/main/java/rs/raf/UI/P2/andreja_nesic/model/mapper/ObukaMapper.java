package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Obuka;
import rs.raf.UI.P2.andreja_nesic.model.dto.ObukaDto;

@Repository
@Mapper(componentModel = "spring")
public interface ObukaMapper extends EntityMapper<ObukaDto, Obuka> {
}