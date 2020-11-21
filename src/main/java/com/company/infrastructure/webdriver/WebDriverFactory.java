package com.company.infrastructure.webdriver;

public interface WebDriverFactory {
    // 1) Написать интерфейс WebDriverFactory, в котором есть метод String create()
    // 3) Метод create должен вернуть строку (пока что) браузер, который будет запущен на основе envVar

    public enum BrowserType {
        CHROME, FIREFOX, INTERNET_EXPLORER
    }

    public String create();
}
