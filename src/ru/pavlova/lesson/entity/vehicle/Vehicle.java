package ru.pavlova.lesson.entity.vehicle;

/**
 * Абстрактный класс транспортные средства
 */
public abstract class Vehicle {
    /**
     * Мощность
     */
    protected int power;
    /**
     * Скорость
     */
    protected int speed;

    public Vehicle(int power, int speed){
        this.power = power;
        this.speed = speed;
    }

    public void showSpeed(){
        System.out.println("Скорость: " + speed);
    }

    abstract public void showPower();

    public void sayAboutMe(){
        showSpeed();
        showPower();
    }
}
