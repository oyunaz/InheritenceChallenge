package com.company;

/**
 * Created by User on 15.06.2017.
 */
public class Track extends Car {
    private int cargo;

    public Track(int gears, int cargo) {
        super("Track", 2, "cargo", 6, 3, gears);
        this.cargo = cargo;
    }

    public void haveCargo(int cargoMass){
        System.out.println("Track.haveCargo(): cargo of track is "+cargoMass);
    }

    public int getCargo() {
        return cargo;
    }

}
