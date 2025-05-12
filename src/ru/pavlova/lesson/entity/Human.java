package ru.pavlova.lesson.entity;

public class Human extends Creature {
    private int age;
    private int height;
    protected String name;

    //дефолтный конструктор
    public Human(){
        System.out.println("Вызываю конструктор класса Human");
    }
    //конструктор с аргументами
    public Human(int age, int height){
        System.out.println("Вызываю консктурктор класса Human 1");
        this.age = age;
        this.height = height;
    }

// геттеры и сеттеры
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        System.out.println("Меняем имя с " + this.name + " на " + name);
        this.name = name;
    }

    public void sayAboutMe(){
        System.out.println("Привет! Меня зовут " + name + ", мне " + getAge()  + "лет. Мой рост - " + getHeight());
    }

    public static void sayAboutHuman(Human human){
        System.out.println("Привет! Меня зовут " + human.name + ", мне " + human.getAge()  + "лет. Мой рост - " + human.getHeight());
    }

    //переопеределяем toString
    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
