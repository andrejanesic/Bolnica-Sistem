package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.LekarOdeljenje;
import rs.raf.UI.P2.andreja_nesic.model.dto.LekarOdeljenjeDto;

@Repository
@Mapper(componentModel = "spring")
public interface LekarOdeljenjeMapper extends EntityMapper<LekarOdeljenjeDto, LekarOdeljenje> {
}