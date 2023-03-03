package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Dezurstvo;
import rs.raf.UI.P2.andreja_nesic.model.dto.DezurstvoDto;

@Repository
@Mapper(componentModel = "spring")
public interface DezurstvoMapper extends EntityMapper<DezurstvoDto, Dezurstvo> {
}