package CelticsPlayers.celticsapi.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CelticsPlayers.celticsapi.model.Players;
import CelticsPlayers.celticsapi.repository.PlayersRepository;

@RestController
@RequestMapping(value="/api")
public class PlayersAPI {
	
	@Autowired
	PlayersRepository playersRepository;
	
	@GetMapping("/all_players")
	public List<Players> getAllPlayers() {
		return playersRepository.findAll();
	}
	
	@GetMapping("/player/{id}")
	public Optional<Players> getPlayerById(@PathVariable(value="id") long id) {
		return playersRepository.findById(id);
	}
	
	@PostMapping("/add_player")
	public Players addPlayer(@RequestBody Players player) {
		return playersRepository.save(player);
	}
	
	@PutMapping("update_player/{id}")
	public Players updatePlayer(@RequestBody Players player, @PathVariable(value="id") long id) {
		return playersRepository.save(player);
	}
	
	@DeleteMapping("/delete_player/{id}")
	public void deletePlayer(@PathVariable(value="id") long id) {
		playersRepository.deleteById(id);
	}
}
