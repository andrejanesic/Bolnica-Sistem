package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.ReceptLekar;
import rs.raf.UI.P2.andreja_nesic.model.dto.ReceptLekarDto;

@Repository
@Mapper(componentModel = "spring")
public interface ReceptLekarMapper extends EntityMapper<ReceptLekarDto, ReceptLekar> {
}