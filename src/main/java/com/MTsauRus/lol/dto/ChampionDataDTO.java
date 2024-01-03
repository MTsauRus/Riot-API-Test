package com.MTsauRus.lol.dto;

import lombok.*;

import java.util.Map;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
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
