package com.example.android.quakereport;

/**
 * Created by jhonys on 12/09/17.
 */

public class Earthquake {

    private double magnitude;

    private String location;

    private long time;

    private String url;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param time is the time in milliseconds (from the Epoch) when the earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long time, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.time = time;
        this.url = url;
    }

    public double getMagnitude() {
        return this.magnitude;
    }

    public String getLocation() {
        return this.location;
    }

    public long getTime() {
        return this.time;
    }

    public String getUrl() {
        return this.url;
    }
}
