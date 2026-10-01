package com.boitenoire.model;

public class NotificationData {
    private String channel;

    private String template;

    private String status;

    public NotificationData() {
    }

    public NotificationData(
            String channel,
            String template,
            String status
    ) {
        this.channel = channel;
        this.template = template;
        this.status = status;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
