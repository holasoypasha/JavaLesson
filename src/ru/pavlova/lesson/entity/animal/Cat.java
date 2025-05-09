package ru.pavlova.lesson.entity.animal;

public class Cat implements Animal {
    @Override
    public void say() {
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кот кушает рыбу");
    }

    @Override
    public boolean getSwim() {
        return false;
    }
}
