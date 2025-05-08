package ru.pavlova.lesson;

import ru.pavlova.lesson.entity.animal.Animal;
import ru.pavlova.lesson.entity.animal.Cat;
import ru.pavlova.lesson.entity.animal.Dog;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat(true);
        Animal dog = new Dog();

        handleAnimal(cat, cat.isCanSwim());
        handleAnimal(dog, false);
    }

    public static void handleAnimal(Animal animal, boolean canSwim){
        animal.eat();
        animal.say();
        animal.swim(canSwim);
    }
}
