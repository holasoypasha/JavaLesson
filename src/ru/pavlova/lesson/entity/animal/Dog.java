package ru.pavlova.lesson.entity.animal;

public class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("Гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест корм");
    }

    @Override
    public boolean getSwim() {
        return true;
    }
}
