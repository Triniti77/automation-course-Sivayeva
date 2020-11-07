package com.company.homework.hw09.tests;

import com.company.infrastructure.TestBase;

public class SearchBase extends TestBase {

    @Override
    protected void beforeTest() {
        clickField();
    }

    private void clickField(){
        logger.log("Click search field");
    }
}
