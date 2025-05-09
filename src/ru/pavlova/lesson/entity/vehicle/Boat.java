package ru.pavlova.lesson.entity.vehicle;

/**
 * Класс лодка, описывает ее свойства
 */
public class Boat extends Vehicle{
    public Boat(int power, int speed) {
        super(power, speed);
    }

    @Override
    public void showPower() {
        System.out.printf("Мощность лодки: %s%n", power);
    }
}
