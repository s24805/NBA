package com.example.nba.servis;

import com.example.nba.models.Player;
import com.example.nba.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    @GetMapping
    public Player createPlayer(Player player){
        return playerRepository.save(player);
    }
    @GetMapping
    public Player findByNameAndLastName(String firstName, String lastName){
        Optional<Player> player = playerRepository.findPlayerByFirstNameAndLastName(firstName, lastName);
        if(player.isPresent()){
            return player.get();
        }
        throw new IllegalArgumentException();
    }
    @GetMapping
    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }
    @GetMapping
    public Player getPlayerById(Long id){
        return playerRepository.getReferenceById(id);
    }
    @DeleteMapping
    public void deletePlayerById(Long id){
        playerRepository.deleteById(id);
    }


}
