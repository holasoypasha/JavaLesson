package ru.pavlova.lesson.entity.animal;

public interface Animal{

    void say();

    void eat();


    /**
     * Дефолтная реализация метода
     *
     * @param canSwim умение плавать
     */
    default void swim(boolean canSwim){
        if (canSwim) {
            System.out.println("Умеет плавать");
        } else {
            System.out.println("Не умеет плавать");
        }
    }

}
