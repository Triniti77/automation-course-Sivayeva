package com.company.infrastructure;

import static com.company.infrastructure.ConfigurationManager.*;

public class WebDriverManager {
    public String createBrowser(){

        switch (ConfigurationManager.getInstance().getTestBrowser()){
            case "chrome":
                return "Coogle Chrome"; // return new ChromeDriver();
            case "firefox":
                return "Mozilla Firefox"; // return new FirefoxDriver();
        }
        return "";
    }

    public void closeBrowser(String browser){
        if(browser != null) {
            // browser.quit();
            System.out.println("Closing browser: " + browser);
        }
    }
}
