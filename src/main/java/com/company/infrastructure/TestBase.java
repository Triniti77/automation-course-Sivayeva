package com.company.infrastructure;

import com.company.infrastructure.logger.FileTestLogger;
import com.company.infrastructure.logger.StdTestLogger;
import com.company.infrastructure.logger.TestLogger;

public abstract class TestBase {

    private WebDriverManager wdm;
    protected String browser;
    protected TestLogger logger;

    public void setup(){
//        logger = new StdTestLogger();
        logger = getLogger();

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
        logger.log("");
    }

    protected void beforeTest(){}

    protected void afterTest() {}

    private TestLogger getLogger(){
        return ConfigurationManager.getInstance().getTestLogger().equals("std")?
                new StdTestLogger():
                new FileTestLogger("report_" + System.currentTimeMillis() + ".txt");
    }

}
