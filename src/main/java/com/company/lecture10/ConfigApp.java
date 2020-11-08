package com.company.lecture10;

import com.company.infrastructure.ConfigurationManager;
import com.company.infrastructure.TestLogger;
import com.company.infrastructure.TestServer;
import com.company.infrastructure.WebDriverManager;

public class ConfigApp {

    public static void main(String[] args) {
        TestLogger logger = new TestLogger();
        WebDriverManager wdm = new WebDriverManager();

        logger.log("Opening browser ");
        String browser = wdm.createBrowser();
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

        wdm.closeBrowser(browser);
    }
}
