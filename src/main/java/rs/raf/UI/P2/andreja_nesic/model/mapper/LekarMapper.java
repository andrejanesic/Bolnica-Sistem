package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Lekar;
import rs.raf.UI.P2.andreja_nesic.model.dto.LekarDto;

@Repository
@Mapper(componentModel = "spring")
public interface LekarMapper extends EntityMapper<LekarDto, Lekar> {
}