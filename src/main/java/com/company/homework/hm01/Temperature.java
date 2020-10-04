package com.company.homework.hm01;

public class Temperature {
    private double celsius;
    private double farenheit;
    private double kelvin;

    public void main() {
        double x = 50;
        this.enterFarenheit(x);
        this.printCelsius();
    }

    public void enterCelsius(double d) {
        this.celsius = d;
        this.calculate();
    }

    public void enterFarenheit(double f) {
        this.farenheit = f;
        this.calculate();
    }

    public void calculate() {
        this.celsius = 5*(this.farenheit-32)/9;
    }

    public void printFarenheit() {
        System.out.println(this.farenheit);
    }

    public void printCelsius() {
        System.out.println(this.celsius);
    }

    public void printKelvin() {
        System.out.println(this.kelvin);
    }
}
