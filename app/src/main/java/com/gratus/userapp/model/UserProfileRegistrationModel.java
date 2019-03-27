package com.gratus.userapp.model;

import java.io.Serializable;

public class UserProfileRegistrationModel implements Serializable {
    private String name;
    private String phone;
    private String email;
    private String address;
    private String description;
    private String covePhoto;
    private String profilePhoto;

    public UserProfileRegistrationModel(String name, String phone, String email, String address, String description,  String covePhoto, String profilePhoto) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.description = description;
        this.covePhoto = covePhoto;
        this.profilePhoto = profilePhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCovePhoto() {
        return covePhoto;
    }

    public void setCovePhoto(String covePhoto) {
        this.covePhoto = covePhoto;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}
