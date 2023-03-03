package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.PacijentLek;
import rs.raf.UI.P2.andreja_nesic.model.dto.PacijentLekDto;

@Repository
@Mapper(componentModel = "spring")
public interface PacijentLekMapper extends EntityMapper<PacijentLekDto, PacijentLek> {
}