package rs.raf.UI.P2.andreja_nesic.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Zaposleni;
import rs.raf.UI.P2.andreja_nesic.model.dto.ZaposleniDto;

@Repository
@Mapper(componentModel = "spring")
public interface ZaposleniMapper extends EntityMapper<ZaposleniDto, Zaposleni> {
}