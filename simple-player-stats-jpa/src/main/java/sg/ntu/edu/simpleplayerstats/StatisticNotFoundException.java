package sg.ntu.edu.simpleplayerstats;

public class StatisticNotFoundException extends RuntimeException {
    StatisticNotFoundException(Long id) {
        super("Could not find statisic " + id);
    }

}