package org.example.CarStart.carFacade;

import org.example.CarStart.carSubclasses.Brake;
import org.example.CarStart.carSubclasses.Engine;
import org.example.CarStart.carSubclasses.Gear;
import org.example.CarStart.carSubclasses.Gearbox;

public class CarFacade {
    private Gear gear;
    private Engine engine;
    private Brake brake;



    public CarFacade() {
        this.gear = new Gear();
        this.engine = new Engine(2.4);
        this.brake = new Brake();
    }

    public void startCar(){
        engine.startEngine();
        gear.changeGear(Gearbox.DRIVE);
        brake.release();
    }
    public void stopCar(){
        brake.push();
        gear.changeGear(Gearbox.PARK);
        engine.stopEngine();
    }
}
