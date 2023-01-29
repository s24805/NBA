package com.example.nba.models;

import com.example.nba.models.enums.positions;
import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "firstname")
    private String firstName;
    private String lastName;
    private int height;
    @Enumerated(EnumType.STRING)
    private positions position;
    private String country;

    @ManyToOne
    @JoinColumn(name = "team")
    private Team team;


    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player( String firstName, String lastName, int height, positions position, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.position = position;
        this.country = country;
    }

    public Player() {

    }

    public int getHeight() {
        return height;
    }

    public positions getPosition() {
        return position;
    }

    public String getCountry() {
        return country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
