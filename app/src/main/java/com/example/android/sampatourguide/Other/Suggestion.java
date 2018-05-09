package com.example.android.sampatourguide.Other;

/**
 * Suggestion Class for Suggestion object.
 */
public class Suggestion {

    private static final int NO_IMAGE_PROVIDED = -1;
    // Initializing Global Variables
    private String mName;
    private String mDescription;
    private String mWebPage;
    private String mAddress;
    private String mPhone;
    private String mSchedule;
    private String mPrice;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constructor
     * Create a Suggestion object based on input parameters
     */
    public Suggestion(String name, String description, String webPage, String address, String phone, String schedule,
                      String price, int imageResourceId) {
        mName = name;
        mDescription = description;
        mWebPage = webPage;
        mAddress = address;
        mPhone = phone;
        mSchedule = schedule;
        mPrice = price;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getWebPage() {
        return mWebPage;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getSchedule() {
        return mSchedule;
    }

    public String getPrice() {
        return mPrice;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasWebPage() {
        return getWebPage() != null;
    }

    public boolean hasPrice() {
        return getPrice() != null;
    }

    public boolean hasPhone() {
        return getPhone() != null;
    }

    public boolean hasAddress() {
        return getAddress() != null;
    }

    public boolean hasSchedule() {
        return getSchedule() != null;
    }

    /**
     * Override toString method
     *
     * @return Return all values as String
     */
    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getWebPage() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getPrice() + "\n" +
                getSchedule() + "\n" +
                getImageResourceId();

        return output;
    }
}
