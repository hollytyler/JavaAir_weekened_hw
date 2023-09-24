package com.codeclan;
import java.util.ArrayList;
import java.util.List;

public class Flight {

    private Pilot pilot;
    private List<CabinCrewMember> cabinCrewMembers;
    private List<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, List<CabinCrewMember> cabinCrewMembers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime)
    {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.bookedPassengers = new ArrayList<>();
    }

    public int availableSeats(){
        return plane.getCapacity() - bookedPassengers.size();
    }
    public boolean bookPassenger(Passenger passenger){
        if(availableSeats() > 0) {
            bookedPassengers.add(passenger);
            return true;
        }
        return false;
    }

    public Pilot getPilot() {
        return pilot;
    }
}
