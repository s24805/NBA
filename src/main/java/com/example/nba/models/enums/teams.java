package com.example.nba.models.enums;

public enum teams {
    LAL("Los Angeles Lakers"),
    LAC("Los Angeles Clippers"),
    BOS("Boston Celtics"),
    GSW("Golden State Warriors")
    ;

    private String displayName;
    teams(String team) {
        this.displayName = team;
    }

    public String displayName(){
        return  displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
