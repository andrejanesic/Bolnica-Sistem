package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.ProceduraZaposleni;
import rs.raf.UI.P2.andreja_nesic.model.dto.ProceduraZaposleniDto;

@Repository
@Mapper(componentModel = "spring")
public interface ProceduraZaposleniMapper extends EntityMapper<ProceduraZaposleniDto, ProceduraZaposleni> {
}