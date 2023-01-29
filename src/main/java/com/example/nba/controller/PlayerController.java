package com.example.nba.controller;


import com.example.nba.models.Player;
import com.example.nba.servis.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player/")
public class PlayerController {
    PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayers(){
        return ResponseEntity.ok(playerService.getAllPlayers());
    }

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody Player author){
        return ResponseEntity.ok(playerService.createPlayer(author));
    }
    //http://localhost:8080/author/1
    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable("id") Long id){
        return ResponseEntity.ok(playerService.getPlayerById(id));
    }

    //http://localhost:8081/author/get?id=2
    @GetMapping("/get")
    public ResponseEntity<Player> getPlayerByIdRequestParam(@RequestParam(name = "id") Long id){
        return ResponseEntity.ok(playerService.getPlayerById(id));
    }

    @DeleteMapping
    public ResponseEntity<String> deletePlayerById(@PathVariable("id") Long id){
        playerService.deletePlayerById(id);
        return ResponseEntity.ok("ok");
    }

}
