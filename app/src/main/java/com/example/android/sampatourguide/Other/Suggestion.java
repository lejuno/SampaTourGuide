package com.example.android.sampatourguide.Other;

import android.util.Log;

/**
 * Suggestion Class for Suggestion object.
 */
public class Suggestion {

    private static final int NO_IMAGE_PROVIDED = -1;
    // Initializing Global Variables
    private String name;
    private String description;
    private String webpage;
    private String address;
    private String phone;
    private String schedule;
    private String price;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constructor
     * Create a Suggestion object
     *
     * @param name
     * @param description
     * @param webpage
     * @param address
     * @param phone
     * @param schedule
     * @param price
     * @param imageResourceId
     */
    public Suggestion(String name, String description, String webpage, String address, String phone, String schedule,
                      String price, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.webpage = webpage;
        this.address = address;
        this.phone = phone;
        this.schedule = schedule;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    /**
     * getName
     *
     * @return Title
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     *
     * @param name Set Title
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getDescription
     *
     * @return Returns description
     */
    public String getDescription() {
        return description;
    }

    /**
     * getWebpage
     *
     * @return Returns webpage
     */
    public String getWebpage() {
        return webpage;
    }

    /**
     * getAddress
     *
     * @return Returns address
     */
    public String getAddress() {
        return address;
    }

    /**
     * getPhone
     *
     * @return Returns contact
     */
    public String getPhone() {
        return phone;
    }

    /**
     * getSchedule
     *
     * @return Return working hours
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * getPrice
     *
     * @return Rerturns Price
     */
    public String getPrice() {
        return price;
    }

    /**
     * getImageResourceId
     *
     * @return Returns Image Resource Id
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * hasImage
     *
     * @return True if image resource id is not -1
     */
    public boolean hasImage() {
        Log.v("hasImage", "word has image: " + (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * has Webpage
     *
     * @return Returns true is getWebpage is not null
     */
    public boolean hasWebpage() {
        return getWebpage() != null;
    }

    /**
     * hasPrice
     *
     * @return Returns true if getPrice is not null
     */
    public boolean hasPrice() {
        return getPrice() != null;
    }

    /**
     * hasPhone
     *
     * @return Returns true if getPhone is not null
     */
    public boolean hasPhone() {
        return getPhone() != null;
    }

    /**
     * hasAddress
     *
     * @return Returns True if getAddress is not null
     */
    public boolean hasAddress() {
        return getAddress() != null;
    }

    /**
     * hasSchedule
     *
     * @return Returns True if getSchedule is not null
     */
    public boolean hasSchedule() {
        return getSchedule() != null;
    }

    /**
     * Override toString method
     *
     * @return Return all texts
     */
    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getWebpage() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getPrice() + "\n" +
                getSchedule() + "\n" +
                getImageResourceId();

        return output;
    }
}
