package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.ProceduraRecept;
import rs.raf.UI.P2.andreja_nesic.model.dto.ProceduraReceptDto;

@Repository
@Mapper(componentModel = "spring")
public interface ProceduraReceptMapper extends EntityMapper<ProceduraReceptDto, ProceduraRecept> {
}