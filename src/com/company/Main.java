package com.company;

public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("Musa");
        fish.setAge(2);
        fish.setColor("green");
        System.out.println(fish.getName() + " " + fish.getAge() + " " + fish.getColor());
        fish.swim();

        Parrot parrot = new Parrot();
        parrot.setName("Lucky");
        parrot.setAge(3);
        parrot.setColor("colorful");
        System.out.println(parrot.getName() + " " + parrot.getAge() + " " + parrot.getColor());
        parrot.speak();

        Cat cat = new Cat();
        cat.setName("Skot");
        cat.setAge(1);
        cat.setColor("orange");
        System.out.println(cat.getName() + " " + cat.getAge() + " " + cat.getColor());
        cat.makeVoice();

        Dog dog = new Dog();
        dog.setName("Alabai");
        dog.setAge(4);
        dog.setColor("black");
        System.out.println(dog.getName() + " " + dog.getAge() + " " + dog.getColor());
        dog.protect();
    }
}
