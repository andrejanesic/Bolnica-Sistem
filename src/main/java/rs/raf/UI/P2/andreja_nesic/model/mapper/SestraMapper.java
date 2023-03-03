package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Sestra;
import rs.raf.UI.P2.andreja_nesic.model.dto.SestraDto;

@Repository
@Mapper(componentModel = "spring")
public interface SestraMapper extends EntityMapper<SestraDto, Sestra> {
}