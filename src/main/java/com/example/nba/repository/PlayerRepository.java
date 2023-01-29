package com.example.nba.repository;

import com.example.nba.models.Player;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    Optional<Player> findPlayerByFirstNameAndLastName(String firstName, String lastName);
    Player findPlayerByFirstName(String firstName);

}
