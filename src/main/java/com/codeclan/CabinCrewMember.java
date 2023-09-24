package com.codeclan;

public class CabinCrewMember {
    private String name;
    private CrewRank rank;

    public CabinCrewMember(String name, CrewRank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CrewRank getRank() {
        return rank;
    }

    public void setRank(CrewRank rank) {
        this.rank = rank;
    }
}

