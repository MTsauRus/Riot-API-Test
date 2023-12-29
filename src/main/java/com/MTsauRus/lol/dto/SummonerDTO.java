package com.MTsauRus.lol.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@AllArgsConstructor
@ToString
public class SummonerDTO {
    /**
     * accountId	string	Encrypted account ID. Max length 56 characters.
     * profileIconId	int	ID of the summoner icon associated with the summoner.
     * revisionDate	long	Date summoner was last modified specified as epoch milliseconds. The following events will update this timestamp: summoner name change, summoner level change, or profile icon change.
     * name	string	Summoner name.
     * id	string	Encrypted summoner ID. Max length 63 characters.
     * puuid	string	Encrypted PUUID. Exact length of 78 characters.
     * summonerLevel	long	Summoner level associated with the summoner.
     */
    //private String accountId;
    //private Long revisionDate;
    //private String id;
    //private String puuid;
    private String name;
    private Long summonerLevel;
    private Integer profileIconId;

}
