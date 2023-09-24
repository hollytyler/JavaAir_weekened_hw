package com.codeclan;

public class Plane {
    private PlaneType planeType;
    private int capacity;
    private double totalWeight;

    public Plane(PlaneType planeType, int capacity, double totalWeight){
        this.planeType = planeType;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
