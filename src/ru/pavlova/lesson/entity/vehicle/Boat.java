package ru.pavlova.lesson.entity.vehicle;

public class Boat extends Vehicle{
    public Boat(int power, int speed) {
        super(power, speed);
    }

    @Override
    public void showPower() {
        System.out.printf("Мощность лодки: %s%n", power);
    }
}
