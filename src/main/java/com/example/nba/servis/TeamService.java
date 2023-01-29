package com.example.nba.servis;

import com.example.nba.models.Team;
import com.example.nba.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
    
    public Team createTeam(Team team){
        return teamRepository.save(team);
    }


    public List<Team> getAllTeams(){
        return teamRepository.findAll();
    }

    public Team getTeamById(Long id){
        return teamRepository.getReferenceById(id);
    }

    public void deleteTeamById(Long id){
        teamRepository.deleteById(id);
    }


}
