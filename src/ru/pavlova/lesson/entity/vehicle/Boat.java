package ru.pavlova.lesson.entity.vehicle;

/**
 * Класс лодка, переопределяет метод вывода мощности.
 */
public class Boat extends Vehicle{
    public Boat(int power, int speed) {
        super(power, speed);
    }
    /**
     * Переопределение метода showPower.
     * Вывод в консоль информацию о мощности лодки.
     */
    @Override
    public void showPower() {
        System.out.printf("Мощность лодки: %s%n", power);
    }
}
