package sg.ntu.edu.simpleplayerstats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/statistic")
public class StatisticController {
    
    @Autowired
    private StatisticService statisticService;

    
    public StatisticController(StatisticService statisticService) {
        this.statisticService = statisticService;
    }

    // Create
    @PostMapping("")
    public ResponseEntity<Statistic> createStatistic(@RequestBody Statistic statistic) {
        Statistic newStatistic = statisticService.saveStatistic(statistic);
        return new ResponseEntity<>(newStatistic, HttpStatus.CREATED);
    }

    // Read All
    @GetMapping("")
    public ResponseEntity<List<Statistic>> getAllStatistics() {
        List<Statistic> allStatistics = statisticService.getAllStatistics();
        return new ResponseEntity<>(allStatistics, HttpStatus.OK);
    }

    // Read One
    @GetMapping("{id}")
    public ResponseEntity<Statistic> getStatistic(@PathVariable Long id) {
        Statistic foundStatistic = statisticService.getStatistic(id);
        return new ResponseEntity<>(foundStatistic, HttpStatus.OK);
    }

    // Update
    @PutMapping("{id}")
    public ResponseEntity<Statistic> updateStatistic(@PathVariable Long id, @RequestBody Statistic statistic) {
        Statistic updatedStatistic = statisticService.updateStatistic(id, statistic);
        return new ResponseEntity<>(updatedStatistic, HttpStatus.OK);
    }

    // Delete
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteStatistic(@PathVariable Long id) {
        statisticService.deleteStatistic(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
