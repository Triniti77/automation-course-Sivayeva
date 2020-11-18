package com.company.infrastructure;

public class TestUrl {

    public static class Builder {
        String protocol = "http" ;
        String domain = "localhost";
        String port = "80";
        String path = "/";
        Element [] param  = null;
        int paramNum = 0;

        private static class Element{
            public String key;
            public String value;

            public Element(String key, String value) {
                this.key = key;
                this.value = value;
            }
        }

        public Builder() {
            this.param = new Element[50];
        }

        public Builder withProtocol(String protocol){
            this.protocol = protocol.toLowerCase();
            return this;
        }

        public Builder withDomain(String domain){
            this.domain = domain.toLowerCase();
            return this;
        }

        public Builder withPort(String port){
            this.port = port;
            return this;
        }

        public Builder withPath(String path){
            this.path = path;
            return this;
        }

        public Builder withParam(String key){
            this.param[paramNum] = new Element(key, "");
            paramNum++;
            return this;
        }

        public Builder withParam(String key, String value){
            this.param[paramNum] = new Element(key, value);
            paramNum++;
            return this;
        }

        public String build(){
            String result = protocol + "://" + domain;
            if (!(protocol.equals("http") && port.equals("80")) && !(protocol.equals("https") && port.equals("443"))) {
                result += ":" + port;
            }
            result += path;
            if (paramNum > 0) {
                result += "?";
            }
            for (int i=0; i < paramNum; i++) {
                if (i > 0) {
                    result += "&";
                }
                Element elem = param[i];
                if (elem.value.equals("")) {
                    result += elem.key;
                } else {
                    result += elem.key + "=" + elem.value;
                }
            }
            return result;
        }

    }
}