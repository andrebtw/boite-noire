package com.boitenoire.model;

public class ApplicationErrorData {
    private String errorCode;

    private String severity;

    private String message;

    private String service;

    public ApplicationErrorData() {
    }

    public ApplicationErrorData(String errorCode, String severity, String message, String service) {
        this.errorCode = errorCode;
        this.severity = severity;
        this.message = message;
        this.service = service;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
