package sg.ntu.edu.simpleplayerstats;

import java.util.List;

public interface StatisticService {
    // CREATE
    Statistic saveStatistic(Statistic statistic);

    // READ
    Statistic getStatistic(Long id);

    List<Statistic> getAllStatistics();

    // UPDATE
    Statistic updateStatistic(Long id, Statistic statistic);

    // DELETE
    void deleteStatistic(Long id);
}
