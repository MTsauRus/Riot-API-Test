package com.MTsauRus.lol.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter @Setter
@AllArgsConstructor
@ToString
public class ChampionDataDTO {
    private Map<String, ChampionDTO> data;

    @Getter
    public static class ChampionDTO {
        private String id;
        private String key;
        private String name;
        private String title;

    }

}
