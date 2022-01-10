package rs.raf.UI.P2.andreja_nesic.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class BlokBuilder {
    public static List<String> getIds() {
        return Collections.singletonList("1");
    }

    public static BlokDto getDto() {
        BlokDto dto = new BlokDto();
        dto.setId("1");
        return dto;
    }
}