package ru.pavlova.lesson.entity;

public class StaticExample {

    static {
        System.out.println("Вызов статического блока");
    }

    {
        System.out.println("Вызов нестатического блока");
    }

    public StaticExample() {
        System.out.println("Вызов конструктора");
    }

    public static void main(String[] args) {
//        StaticExample staticExample2 = new StaticExample();
        new StaticExample();
    }


}
