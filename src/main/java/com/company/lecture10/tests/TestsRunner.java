package com.company.lecture10.tests;

public class TestsRunner {
    public static void main(String[] args) {
        RozetkaFilterTests tests = new RozetkaFilterTests();

        tests.setup();
        tests.testOpenComputersItem();
        tests.cleanUp();

        System.out.println("-----------");

        tests.setup();
        tests.testOpenElectronicsItem();
        tests.cleanUp();

        System.out.println("-----------");

        tests.setup();
        tests.testOpenBooksItem();
        tests.cleanUp();

        System.out.println("-----------");

        MyOrdersTests otherTests = new MyOrdersTests();

        otherTests.setup();
        otherTests.testListOrder();
        otherTests.cleanUp();

        System.out.println("-----------");
        otherTests.setup();
        otherTests.testEmtyOrderList();
        otherTests.cleanUp();
    }
}
