package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Blok;
import rs.raf.UI.P2.andreja_nesic.model.dto.BlokDto;

@Repository
@Mapper(componentModel = "spring")
public interface BlokMapper extends EntityMapper<BlokDto, Blok> {
}