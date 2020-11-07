package com.company.homework.hw09.tests;

import com.company.infrastructure.TestBase;

public class WishListBase extends TestBase {
    protected static final String WISHLIST_NAME = "TestName";

    @Override
    protected void beforeTest() {
        login();
        createEmptyList();
    }

    private void login(){
        logger.log("Login to website");
    }

    private void createEmptyList(){
        logger.log("Open wishlist page");
        logger.log("Create new wishlist");
    }

}
