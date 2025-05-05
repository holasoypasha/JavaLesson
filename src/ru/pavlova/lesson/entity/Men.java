package ru.pavlova.lesson.entity;

public class Men extends Human{
    public Men(String name, int age, int height){
        super(age, height);
        System.out.println("Вызываю конструктор класса Men");
        this.name = name;

    }

}
