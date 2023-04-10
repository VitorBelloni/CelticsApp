package CelticsPlayers.celticsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CelticsPlayers.celticsapi.model.Players;

public interface PlayersRepository extends JpaRepository<Players, Long> {
	
	

}
