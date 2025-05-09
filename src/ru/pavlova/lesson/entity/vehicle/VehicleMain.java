package ru.pavlova.lesson.entity.vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Car(500, 200);
        Vehicle boat = new Boat(300, 100);

        handleVehicle(car);
        handleVehicle(boat);
    }

    public static void handleVehicle(Vehicle vehicle){
        vehicle.sayAboutMe();
    }
}
