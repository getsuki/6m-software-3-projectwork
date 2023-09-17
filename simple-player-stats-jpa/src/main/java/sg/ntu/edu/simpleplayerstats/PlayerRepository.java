package sg.ntu.edu.simpleplayerstats;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findByFirstName(String firstName);
}
