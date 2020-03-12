package Polymorphism.Vehicles;

import Inheritance.Vehicles.*;

public class VehicleTest {

    public static void main(String[] args) {

        Car car = new Car();
       //car.setDiesel(false);
        car.setSpeed(200);
        car.setColour(1);  // red

        Plane plane = new Plane();
        //plane.setMaxAltitude(10000);
        plane.setSpeed(500);
        plane.setColour(2); // green

        Boat boat = new Boat();
        //boat.setHasEngine(false);
        boat.setSpeed(10);
        boat.setColour(3); // blue

        Vehicle[] fleet = {car, boat, plane};

        for (int i = 0; i < fleet.length; i++) {
            System.out.println(fleet[i].getSpeed());
        }

        Vehicle vehicle = boat;
        System.out.println(vehicle.getSpeed());

        Boat b = (Boat)vehicle;
        System.out.println(b.isHasEngine());
    }

}