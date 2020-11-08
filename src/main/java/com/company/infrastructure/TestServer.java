package com.company.infrastructure;

public class TestServer {
    public static String getUrl(){
        switch (ConfigurationManager.getInstance().getTestEnv()){
            case "dev":
                return "https://localhost:3000 ";
            case "staging":
                return "https://stagin.mysite.com";
            case "test":
                return "https://test.mysite.com";
            case "production":
            default:
                return "https://mysite.com";
        }
    }
}
