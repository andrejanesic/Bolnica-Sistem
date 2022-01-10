package rs.raf.UI.P2.andreja_nesic.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomUtils {
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}