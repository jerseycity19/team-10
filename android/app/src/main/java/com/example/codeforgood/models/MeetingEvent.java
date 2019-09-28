package com.example.codeforgood.models;

public class MeetingEvent {
    private String url;
    private String imagePath;
    private int month;
    private String date;

    public MeetingEvent(String url, int month, String date, String imagePath) {
        this.url = url;
        this.imagePath = imagePath;
        this.month = month;
        this.date = date;
    }

    public MeetingEvent() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
