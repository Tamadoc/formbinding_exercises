package com.terisandstedt.mvc.mvc_exercises.model;

import java.util.UUID;

public class CustomerDetails {

    private final UUID detailsId;
    private String street;
    private String postcode;
    private String city;
    private String homePhone;
    private String mobilePhone;

    public CustomerDetails() {
        detailsId = UUID.randomUUID();
    }

    public UUID getDetailsId() {
        return detailsId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
