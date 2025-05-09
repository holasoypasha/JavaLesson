package ru.pavlova.lesson.entity.animal;

/**
 * Интерфейс Animal, описывает поведение животного
 */
public interface Animal{
    /**
     * Метод, какой звук издает животное
     */
    void say();
    /**
     * Метод, что ест животное
     */
    void eat();

    /**
     * Метод, умеет ли животное плавать
     * @return умение животного плавать
     */
    boolean getSwim();

    /**
     * Дефолтная реализация метода
     */
    default void swim(){
        if (getSwim()) {
            System.out.println("Умеет плавать");
        } else {
            System.out.println("Не умеет плавать");
        }
    }


}
