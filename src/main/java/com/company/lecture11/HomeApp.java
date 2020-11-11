package com.company.lecture11;

import java.util.Random;

public class HomeApp {
    public static void main(String[] args) {

//        Pet pet = new Pet("Harry", 5);
//
//        System.out.println(pet);

//        Dog dog = new Dog("Rudy", 3, "dog");
//        System.out.println(dog);

//        Pet laika = new Dog("Laika", 4, "husky");
//        System.out.println(laika);

//        Cat cat = new Cat("Murka", 2, false);
//        System.out.println(cat);

//        Pet puma = new Cat("Puma", 5, true);
//        System.out.println(puma);

        Pet pet = new Pet("Larry",5) {
            @Override
            public void say() {
                System.out.println("wow, wow, wow");
            }
        };
        System.out.println(pet);

        pet.say();
                            // ((Cat) pet).getPredator();---> преобразовал тип pet в cat ---> можно, но нельзя

    }

    public static Pet getPet(){
        if(new Random().nextInt(10) % 2 == 0)
            return new Dog("Laika", 4, "husky");
        else
            return new Cat("Murka", 3, false);
    }
}
