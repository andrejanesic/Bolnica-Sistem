package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Procedura;
import rs.raf.UI.P2.andreja_nesic.model.dto.ProceduraDto;

@Repository
@Mapper(componentModel = "spring")
public interface ProceduraMapper extends EntityMapper<ProceduraDto, Procedura> {
}