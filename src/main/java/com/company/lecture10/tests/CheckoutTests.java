package com.company.lecture10.tests;

import com.company.infrastructure.TestBase;

public class CheckoutTests extends OrdersTestBase {

    @Override
    protected void beforeTest() {
        super.beforeTest();

        logger.log("Click Checkout button");
    }
}
