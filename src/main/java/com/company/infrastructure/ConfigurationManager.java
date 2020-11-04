package com.company.infrastructure;

public class ConfigurationManager {

    private ConfigurationManager() {
    }

    public ConfigurationManager getInstance(){
        return null;
    }
    public String getTestBrowser(){
        return getEnvironmentVariableOrDefault("testBrowser", "Firefox");
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

