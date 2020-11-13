package com.company.infrastructure.webdriver;

import com.company.infrastructure.ConfigurationManager;

public class DefaultWebDriverManager implements WebDriverManager {
    // 5) Написать класс DefaultWebDriverManager, который реализует WebDriverManager

    @Override
    public String getBrowser() {
        WebDriverFactory wdf;
        switch (ConfigurationManager.getInstance().getRunOn()){
            case "remote":
                wdf = new RemoteWebDriverFactory();
                break;
            case "cloud":
                wdf = new CloudWebDriverFactory();
                break;
            default:
                wdf = new LocalWebDriverFactory();
        }
        return wdf.create();
    }

    @Override
    public void destroyBrowser(String browser) {
        if(browser != null) {
            // browser.quit();
            System.out.println("Closing browser: " + browser);
        }
    }

}
