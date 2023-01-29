package com.example.nba.models;

import com.example.nba.models.enums.teams;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.Date;
@Entity
@Component
@Table(name = "match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "matchDay")
    private Date matchDay;
    private String city;
    @ManyToOne
    @JoinColumn(name = "home_id")
    private Team home;
    @ManyToOne
    @JoinColumn(name = "away_id")
    private Team away;
    private int pointsHome;
    private int pointsAway;

    public Match(Date matchDay, String city, Team home, Team away, int pointsHome, int pointsAway) {
        this.matchDay = matchDay;
        this.city = city;
        this.home = home;
        this.away = away;
        this.pointsHome = pointsHome;
        this.pointsAway = pointsAway;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Match() {

    }

    public Date getMatchDay() {
        return matchDay;
    }

    public String getCity() {
        return city;
    }

    public Team getHome() {
        return home;
    }

    public Team getAway() {
        return away;
    }

    public teams getAbbrevationAway() {
        return away.getAbbrevation();
    }

    public teams getAbbrevationHome() {
        return home.getAbbrevation();
    }

    public int getPointsHome() {
        return pointsHome;
    }

    public int getPointsAway() {
        return pointsAway;
    }
}
