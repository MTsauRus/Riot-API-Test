package com.MTsauRus.lol.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@AllArgsConstructor
@ToString
public class ChampionMasteryDTO {
    /**
     * puuid	string	Player Universal Unique Identifier. Exact length of 78 characters. (Encrypted)
     * championPointsUntilNextLevel	long	Number of points needed to achieve next level. Zero if player reached maximum champion level for this champion.
     * chestGranted	boolean	Is chest granted for this champion or not in current season.
     * championId	long	Champion ID for this entry.
     * lastPlayTime	long	Last time this champion was played by this player - in Unix milliseconds time format.
     * championLevel	int	Champion level for specified player and champion combination.
     * summonerId	string	Summoner ID for this entry. (Encrypted)
     * championPoints	int	Total number of champion points for this player and champion combination - they are used to determine championLevel.
     * championPointsSinceLastLevel	long	Number of points earned since current level has been achieved.
     * tokensEarned	int	The token earned for this champion at the current championLevel. When the championLevel is advanced the tokensEarned resets to 0.
     */
    private Long championId;
    private Integer championLevel;
    private Integer championPoints;
}
