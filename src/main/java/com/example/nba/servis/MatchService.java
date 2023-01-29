package com.example.nba.servis;

import com.example.nba.models.Match;
import com.example.nba.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Component
public class MatchService {
    MatchRepository matchRepository;

    @Autowired
    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }
    @PostMapping
    public Match createMatch(Match match){
        return matchRepository.save(match);
    }
    @GetMapping
    public List<Match> getAllMatchs(){
        return matchRepository.findAll();
    }
    @GetMapping
    public Match getMatchById(Long id){
        return matchRepository.getReferenceById(id);
    }
    @GetMapping
    public void deleteMatchById(Long id){
        matchRepository.deleteById(id);
    }

}
