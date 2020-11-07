package com.company.lecture10.tests;
import com.company.infrastructure.TestBase;

public class MyOrdersTests extends ClientTestBase {

    @Override
    protected void afterTest() {
        logger.log("Delete orders");
    }

    public void testListOrder() {
        logger.log("Add order to page");
        logger.log("Open personal page");
        logger.log("Click on My Orders link");
        logger.log("Check list of orders");
    }
    public void testEmtyOrderList() {

        logger.log("Open personal page");
        logger.log("Click on My Orders link");
        logger.log("Check list of orders is empty");
    }

}
