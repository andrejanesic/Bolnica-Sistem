package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Dijagonza;
import rs.raf.UI.P2.andreja_nesic.model.dto.DijagonzaDto;

@Repository
@Mapper(componentModel = "spring")
public interface DijagonzaMapper extends EntityMapper<DijagonzaDto, Dijagonza> {
}