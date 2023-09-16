package sg.ntu.edu.simpleplayerstats;

import java.util.List;

public interface PlayerService {
    Player createPlayer(Player player);

    Player getPlayer(Long id);

    List<Player> getAllPlayers();

    Player updatePlayer(Long id, Player player);

    void deletePlayer(Long id);

    Statistic addStatisticToPlayer(Long id, Statistic statistic);

    List<Player> searchPlayers(String playerName);
}
