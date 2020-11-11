package com.company.lecture10.tests;

public class OrdersTestBase extends ClientTestBase {

    @Override
    protected void beforeTest() {
//        super.beforeTest();
        super.beforeTest();
        logger.log("Create one order");
        logger.log("Open My Orders page");
    }
}
