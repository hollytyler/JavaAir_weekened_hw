package com.codeclan;

public class Main {
    public static void main(String[] args){
    Plane plane = new Plane(PlaneType.BOEING747, 280, 50000.0);
    Pilot pilot = new Pilot("Ryan", CrewRank.CAPTAIN, "S399041", plane);


    String flightMessage = pilot.flyPlane();
        System.out.println(flightMessage);
    }
}