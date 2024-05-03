package org.example.CarStart;

import org.example.CarStart.carFacade.CarFacade;

public class CarMain {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.startCar();
        System.out.println("===============");
        carFacade.stopCar();
    }
}
