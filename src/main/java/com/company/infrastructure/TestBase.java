package com.company.infrastructure;

import com.company.infrastructure.logger.FileTestLogger;
import com.company.infrastructure.logger.StdTestLogger;
import com.company.infrastructure.logger.TestLogger;
import com.company.infrastructure.webdriver.DefaultWebDriverManager;

public abstract class TestBase {

    private DefaultWebDriverManager wdm;
    protected String browser;
    protected TestLogger logger;

    public void setup(){
//        logger = new StdTestLogger();
        logger = getLogger();

        logger.log("Open browser");
        wdm = new DefaultWebDriverManager();
        browser = wdm.getBrowser();

        logger.log("Open rozetka site");


        beforeTest();
    }

    public void cleanUp(){
        afterTest();

        logger.log("Closing browser");
        wdm.destroyBrowser(browser);
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
