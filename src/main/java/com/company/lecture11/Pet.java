package com.company.lecture11;

public abstract class Pet {

    private String name;
    private int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public final String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void say();

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
