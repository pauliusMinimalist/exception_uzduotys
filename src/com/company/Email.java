package com.company;

public class Email {

    private String receiver;
    private String theme;
    private String content;

    public Email(String receiver, String theme, String content) {
        this.receiver = receiver;
        this.theme = theme;
        this.content = content;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
