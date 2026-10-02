package com.boitenoire.Model;


public class ApiCallData {
    private String endpoint;

    private String method;

    private int statusCode;

    private long responseTimeMs;

    public ApiCallData() {
    }

    public ApiCallData(String endpoint, String method, int statusCode, long responseTimeMs) {
        this.endpoint = endpoint;
        this.method = method;
        this.statusCode = statusCode;
        this.responseTimeMs = responseTimeMs;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public long getResponseTimeMs() {
        return responseTimeMs;
    }

    public void setResponseTimeMs(long responseTimeMs) {
        this.responseTimeMs = responseTimeMs;
    }
}
