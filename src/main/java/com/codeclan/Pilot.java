package com.codeclan;

public class Pilot {
    private String name;
    private CrewRank rank;
    private String pilotLicenseNumber;
    private Plane plane;
    public Pilot(String name, CrewRank rank, String pilotLicenseNumber, Plane plane){
        this.name = name;
        this.rank = rank;
        this.pilotLicenseNumber = pilotLicenseNumber;
        this.plane = plane;
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

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }

    public void setPilotLicenseNumber(String pilotLicenseNumber) {
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String flyPlane() {
        if (plane != null) {
            return "Pilot " + name + " is flying the " + plane.getPlaneType() + " plane.";
        } else {
            return "Pilot " + name + " is not flying a plane.";
        }
    }




}
