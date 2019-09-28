package com.example.codeforgood.models;

public class MeetingEvent {
    private String url;
    private String imagePath;
    private String day;
    private String date;

    public MeetingEvent(String url, String day, String date, String imagePath) {
        this.url = url;
        this.imagePath = imagePath;
        this.day = day;
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

    public String getDay() {
        return day;
    }

    public void setDay(int month) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
