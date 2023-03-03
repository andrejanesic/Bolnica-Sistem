package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Recept;
import rs.raf.UI.P2.andreja_nesic.model.dto.ReceptDto;

@Repository
@Mapper(componentModel = "spring")
public interface ReceptMapper extends EntityMapper<ReceptDto, Recept> {
}