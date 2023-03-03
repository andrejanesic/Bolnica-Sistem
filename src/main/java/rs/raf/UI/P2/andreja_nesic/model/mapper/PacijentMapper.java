package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Pacijent;
import rs.raf.UI.P2.andreja_nesic.model.dto.PacijentDto;

@Repository
@Mapper(componentModel = "spring")
public interface PacijentMapper extends EntityMapper<PacijentDto, Pacijent> {
}