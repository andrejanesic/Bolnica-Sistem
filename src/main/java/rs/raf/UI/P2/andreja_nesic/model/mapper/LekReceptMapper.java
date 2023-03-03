package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.LekRecept;
import rs.raf.UI.P2.andreja_nesic.model.dto.LekReceptDto;

@Repository
@Mapper(componentModel = "spring")
public interface LekReceptMapper extends EntityMapper<LekReceptDto, LekRecept> {
}