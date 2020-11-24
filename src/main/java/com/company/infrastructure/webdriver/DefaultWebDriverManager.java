package com.company.infrastructure.webdriver;

import com.company.infrastructure.ConfigurationManager;

public class DefaultWebDriverManager implements WebDriverManager {
    // 5) Написать класс DefaultWebDriverManager, который реализует WebDriverManager

    @Override
    public String getBrowser() {
        WebDriverFactory wdf = null;
//        public String create() {
//        BrowserType browserType = BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser());
//
//        switch (browserType)
        RunOn runOn = RunOn.valueOf(ConfigurationManager.getInstance().getRunOn().toUpperCase().toUpperCase());
    //
        switch (runOn){
            case LOCAL:
                wdf = new LocalWebDriverFactory();
                break;
            case REMOTE:
                wdf = new RemoteWebDriverFactory();
                break;
            case CLOUD:
                wdf = new CloudWebDriverFactory();
                break;
        }
        return wdf == null? "" : wdf.create() ;
    }

    @Override
    public void destroyBrowser(String browser) {
        if(browser != null) {
            // browser.quit();
            System.out.println("Closing browser: " + browser);
        }
    }

}
