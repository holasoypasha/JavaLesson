package ru.pavlova.lesson.entity.vehicle;

public class Car extends Vehicle {
    public Car(int power, int speed){
        super(power, speed);
    }

    /**
     * Переопределение метода showPower.
     * Вывод в консоль информацию о мощности машины.
     */
    @Override
    public void showPower() {
        System.out.printf("Мощность автомобиля: %s%n", power);
    }
}
