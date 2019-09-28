package com.example.codeforgood.models;

import java.util.Date;

public class MeetingEvent {
    private String url;
    private Date time;
    private String imagePath;

    public MeetingEvent(String url, Date time, String imagePath) {
        this.url = url;
        this.time = time;
        this.imagePath = imagePath;
    }

    public MeetingEvent() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
