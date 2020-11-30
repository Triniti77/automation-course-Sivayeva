package com.company.infrastructure;

public class TestUrl {
    private String protocol = "http" ;
    private String domain = "localhost";
    private String port = "80";
    private String path = "/";
    private String param  = "";



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

    public String getParam() {
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
            this.url.param += this.url.param.length() == 0? key: "&" + key;
            return this;
        }

        public Builder withParam(String key, String value){
            this.url.param += this.url.param.length() == 0? key: "&" + key + "=" + value;
            return this;
        }

        public String build(){
            String result = this.url.protocol + "://" + this.url.domain;
            if (!(this.url.protocol.equals("http") && this.url.port.equals("80")) && !(this.url.protocol.equals("https") && this.url.port.equals("443"))) {
                result += ":" + this.url.port;
            }
            result += this.url.path;
            if (this.url.param.length() > 0) {
                result += "?" + url.param;
            }
            return result;
        }

    }
}