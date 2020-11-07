package com.company.lecture10.tests;

import com.company.infrastructure.TestBase;

public class ClientTestBase extends TestBase {

    @Override
    protected void beforeTest() {
        logger.log("Login to website");
    }

}
