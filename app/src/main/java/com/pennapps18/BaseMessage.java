package com.pennapps18;

import android.location.Location;

import java.util.Calendar;

public class BaseMessage {
    private String body;
    private String sender;
    private String timeStamp;
    private int urgency;
    private Location coords;

    public BaseMessage(String msg, String usr, String time, int urg, Location place) {
        this.body = msg;
        this.sender = usr;
        this.timeStamp = time;
        this.urgency = urg;
        this.coords = place;
    }

    public String getBody() {
        return this.body;
    }

    public String getSender() {
        return this.sender;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public int getUrgency() {
        return this.urgency;
    }

    public Location getCoords() { return this.coords; }
}
