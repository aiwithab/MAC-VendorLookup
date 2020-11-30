package com.inerton.app.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VendorDetails {

    @SerializedName("oui")
    @Expose
    private String oui;
    @SerializedName("isPrivate")
    @Expose
    private Boolean isPrivate;
    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("companyAddress")
    @Expose
    private String companyAddress;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;

    public String getOui() {
        return oui;
    }

    public void setOui(String oui) {
        this.oui = oui;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString () {
        return "VendorDetails{" +
                "oui='" + oui + '\'' +
                ", isPrivate=" + isPrivate +
                ", companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}