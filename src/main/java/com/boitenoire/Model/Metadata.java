package com.boitenoire.Model;

public class Metadata {
    private String version;
    private String environment;

    public Metadata() {
    }

    public Metadata(String version, String environment) {
        this.version = version;
        this.environment = environment;
    }

    public String getVersion() {

        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public String getEnvironment() {
        return environment; }
    public void setEnvironment(String environment) {

        this.environment = environment;
    }
}
