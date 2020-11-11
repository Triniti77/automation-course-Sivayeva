package com.company.homework.hw07;

import com.company.infrastructure.logger.StdTestLogger;

public class SomeTest {

    public static void main(String[] args) {

        StdTestLogger logger = new StdTestLogger();

        logger.log("Start browser");
        logger.log("Open website");
        logger.log("Click login link");
        logger.log("Enter email");
        logger.log("Enter passeword");
        logger.log("Click Login button");
        logger.log("Check urer logger in");
        logger.log("Close browser");

    }
}
