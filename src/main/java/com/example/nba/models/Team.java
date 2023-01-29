package com.example.nba.models;

import com.example.nba.models.enums.teams;
import jakarta.persistence.*;


@Entity
@Table(name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Enumerated(EnumType.STRING)
    private teams abbrevation;
    @Enumerated(EnumType.STRING)
    private teams teamName;
    private String City;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team() {

    }

    public teams getAbbrevation() {
        return abbrevation;
    }

    public String getTeamName() {
        return teamName.displayName();
    }

    public String getCity() {
        return City;
    }

    public Team(teams abbrevation, teams teamName, String city) {
        this.abbrevation = abbrevation;
        this.teamName = teamName;
        City = city;
    }
}
