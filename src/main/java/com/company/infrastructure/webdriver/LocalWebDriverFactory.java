package com.company.infrastructure.webdriver;

import com.company.infrastructure.ConfigurationManager;

public class LocalWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {

        switch (ConfigurationManager.getInstance().getTestBrowser()){
            case "chrome":
                return "Google Chrome"; // return new ChromeDriver();
            case "firefox":
                return "Mozilla Firefox"; // return new FirefoxDriver();
        }
        return "Internet Explorer";
    }
}
