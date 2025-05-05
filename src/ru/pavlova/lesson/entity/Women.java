package ru.pavlova.lesson.entity;

public class Women extends Human {
    //Переопределяем метод sayAboutMe
    @Override
    public void sayAboutMe() {
        System.out.println(this);

    }


}
