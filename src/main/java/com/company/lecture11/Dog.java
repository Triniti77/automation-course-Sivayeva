package com.company.lecture11;

public final class Dog extends Pet {

    private String species;

    public Dog(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public int getAge() {

        int age = super.getAge();

        if (age == 1)
            return 5;
        else if (age == 2)
            return 9;
        else
            return 9 + 5 * (age - 2);
    }

    @Override
    public void say() {
        System.out.println("WOOF");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
