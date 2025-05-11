package ru.pavlova.lesson;

import ru.pavlova.lesson.entity.animal.Animal;
import ru.pavlova.lesson.entity.animal.Cat;
import ru.pavlova.lesson.entity.animal.Dog;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal dog = new Dog();

        handleAnimal(cat);
        handleAnimal(dog);
    }

    public static void handleAnimal(Animal animal){
        animal.eat();
        animal.say();
        animal.swim();
    }
}
