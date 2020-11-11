package com.company.lecture11;

public final class Cat extends Pet {

    private Boolean predator;

    public Cat(String name, int age, Boolean predator) {
        super(name, age);
        this.predator = predator;
    }

    public Boolean getPredator() {
        return predator;
    }

    @Override
    public int getAge() {
        int age = super.getAge();

        if (age == 1)
            return 5;
        else if (age == 2)
            return 9;
        else
            return 9 + 4 * (age - 2);
    }

//    public String getName(){   ----> так не могу написать так как метод является финальным
//        return "";
//    }

    @Override
    public void say() {
        System.out.println("MEOW");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() + '\'' +
                ", predator=" + predator +
                '}';
    }
}
