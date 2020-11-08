package com.company.infrastructure;

public class ConfigurationManager {
    static private ConfigurationManager instance = null;

    private ConfigurationManager() {
    }

    static public ConfigurationManager getInstance(){
        if (instance == null){
            instance = new ConfigurationManager();
        }
        return instance;
    }
    public String getTestBrowser(){
        return getEnvironmentVariableOrDefault("testBrowser", "firefox");
    }
    public String getTestEnv(){
        return getEnvironmentVariableOrDefault("testEnv", "");
    }
    private String getEnvironmentVariableOrDefault(String envVar, String defaultValue){
        return (System.getenv(envVar) != null && !System.getenv(envVar).isBlank()) ?
                System.getenv(envVar) :
                defaultValue;
    }

}

