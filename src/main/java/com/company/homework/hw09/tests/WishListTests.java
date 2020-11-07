package com.company.homework.hw09.tests;


public class WishListTests extends WishListBase {


    public void testCreateWishList() {
        logger.log("Check wishlist "+WISHLIST_NAME+" created");
    }

    public void testWishListAvailable() {
        logger.log("Open main page");
        logger.log("Click add on wish list icon");
        logger.log("Check wishlist " + WISHLIST_NAME + " present");
    }

    public void testItemAddToWishList() {
        logger.log("Click add on wish list icon");
        logger.log("Select " +WISHLIST_NAME+ " from wishlist");
        logger.log("Check message item added to wish list");
    }
}
