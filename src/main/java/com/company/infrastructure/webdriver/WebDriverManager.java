package com.company.infrastructure.webdriver;

    public interface WebDriverManager {
        //4) Написать интерфейс WebDriverManager с двумя методами: getBrowser() и destroyBrowser(String browser)
        // 6) метод getBrowser должен вернуть браузер на основе enVar runOn (значения: local, remote, cloud)
        // 7) Заменить старый WebDriverManager на новый

        public String getBrowser();

        public void destroyBrowser(String browser);

    }

