package com.company.infrastructure;

public class TestBase {

    private WebDriverManager wdm;
    protected String browser;
    protected TestLogger logger;

    public void setup(){
        logger = new TestLogger();

        logger.log("Open browser");
        wdm = new WebDriverManager();
        browser = wdm.createBrowser();

        logger.log("Open rozetka site");


        beforeTest();
    }

    public void cleanUp(){
        afterTest();

        logger.log("Closing browser");
        wdm.closeBrowser(browser);
    }

    protected void beforeTest(){}

    protected void afterTest() {}

}
