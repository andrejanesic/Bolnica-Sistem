package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Odeljenje;
import rs.raf.UI.P2.andreja_nesic.model.dto.OdeljenjeDto;

@Repository
@Mapper(componentModel = "spring")
public interface OdeljenjeMapper extends EntityMapper<OdeljenjeDto, Odeljenje> {
}