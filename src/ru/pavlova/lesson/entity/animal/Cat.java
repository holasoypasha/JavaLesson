package ru.pavlova.lesson.entity.animal;

public class Cat implements Animal {
    private boolean canSwim;

    public Cat(boolean canSwim){
        this.canSwim = canSwim;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    @Override
    public void say() {
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кот кушает рыбу");
    }

}
