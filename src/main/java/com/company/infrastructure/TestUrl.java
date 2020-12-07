package com.company.infrastructure;

import java.util.*;

public class TestUrl {
    private String protocol = "http" ;
    private String domain = "localhost";
    private String port = "80";
    private String path = "/";
    private Map<String, List<String>> param;

    public TestUrl() {
        this.param = new LinkedHashMap<>();
    }

    public String getProtocol() {
        return protocol;
    }

    public String getDomain() {
        return domain;
    }

    public String getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public Map<String, List<String>> getParam() {
        return param;
    }

    public static class Builder {

        private TestUrl url;

        public Builder() {
            this.url = new TestUrl();
        }

        public Builder withProtocol(String protocol){
            this.url.protocol = protocol.toLowerCase();
            return this;
        }

        public Builder withDomain(String domain){
            this.url.domain = domain.toLowerCase();
            return this;
        }

        public Builder withPort(String port){
            this.url.port = port;
            return this;
        }

        public Builder withPath(String path){
            this.url.path = path;
            return this;
        }

        public Builder withParam(String key){
            this.withParam(key, null);
            return this;
        }

        public Builder withParam(String key, String value){
            if (!this.url.param.containsKey(key)) {
                this.url.param.put(key, new ArrayList<>());
            }
            List<String> values = this.url.param.get(key);
            values.add(value);
            return this;
        }

        public String build(){
            String result = this.url.protocol + "://" + this.url.domain;
            if (!(this.url.protocol.equals("http") && this.url.port.equals("80")) && !(this.url.protocol.equals("https") && this.url.port.equals("443"))) {
                result += ":" + this.url.port;
            }
            result += this.url.path != null && !this.url.path.isEmpty() ? this.url.path : "/";
            if (this.url.param.size() > 0) {
                result += "?";
                String amp = "";
                for (Map.Entry<String, List<String>> item : this.url.param.entrySet()) {
                    List<String> values = item.getValue();
                    String key = item.getKey();
                    if (values.size() == 1) {
                        String value = values.get(0);
                        result += amp + (value != null ? key + "=" + value : key);
                    } else {
                        for (String value : values) {
                            result += amp + (key + "=" + (value != null ? value : "null"));
                            if (amp.isEmpty()) {
                                amp = "&";
                            }
                        }
                    }
                    if (amp.isEmpty()) {
                        amp = "&";
                    }
                }
            }
            return result;
        }
    }
}