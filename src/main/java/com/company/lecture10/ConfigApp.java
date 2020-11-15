package com.company.lecture10;

import com.company.infrastructure.logger.StdTestLogger;
import com.company.infrastructure.TestServer;
import com.company.infrastructure.webdriver.DefaultWebDriverManager;

public class ConfigApp {

    public static void main(String[] args) {
        StdTestLogger logger = new StdTestLogger();
        DefaultWebDriverManager wdm = new DefaultWebDriverManager();

        logger.log("Opening browser ");
        String browser = wdm.getBrowser();
        System.out.println("---> Opened browser : " + browser);

        logger.log("Opening website");
        String url = TestServer.getUrl();
        System.out.println("--> Opened " + url);

        logger.log("step 1");
        logger.log("step 2");
        logger.log("step 3");
        logger.log("step 4");
        logger.log("step 5");
        logger.log("step 6");
        logger.log("check");

        logger.log("Closing browser");

        wdm.destroyBrowser(browser);
    }
}
