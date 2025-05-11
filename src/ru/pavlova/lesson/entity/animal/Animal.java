package ru.pavlova.lesson.entity.animal;

/**
 * Интерфейс Animal, описывает поведение животного
 */
public interface Animal{
    /**
     * Какой звук издает животное
     */
    void say();
    /**
     * Что ест животное
     */
    void eat();

    /**
     * Умеет ли животное плавать
     * @return умение животного плавать
     */
    boolean getSwim();

    /**
     * Дефолтная реализация метода, проверяет, умеет ли животное плавать, и выводит результат.
     */
    default void swim(){
        if (getSwim()) {
            System.out.println("Умеет плавать");
        } else {
            System.out.println("Не умеет плавать");
        }
    }


}
