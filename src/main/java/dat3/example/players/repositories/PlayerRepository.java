package dat3.example.players.repositories;

import dat3.example.players.entity.Player;
import org.springframework.data.repository.CrudRepository;


public interface PlayerRepository extends CrudRepository<Player,Integer> {
}
