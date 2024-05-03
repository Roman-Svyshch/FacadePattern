package org.example.CarStart.carSubclasses;

public class Engine {
    private double volumeEngine;

    public Engine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public void startEngine(){
        System.out.println("Engine with volume " + volumeEngine + " start");
    }
    public void stopEngine(){
        System.out.println("Engine with volume " + volumeEngine + " stop");
    }
}
