package com.company.infrastructure.webdriver;

import com.company.infrastructure.ConfigurationManager;

public class LocalWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {
        BrowserType browserType = BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

        switch (browserType){
            case CHROME:
                return "Google Chrome"; // return new ChromeDriver();
            case FIREFOX:
                return "Mozilla Firefox"; // return new FirefoxDriver();
            case INTERNET_EXPLORER:
                return "Internet Explorer"; // return new FirefoxDriver();

        }
        return "Error";
    }
}
