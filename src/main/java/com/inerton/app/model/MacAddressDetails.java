package com.inerton.app.model;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MacAddressDetails {

    @SerializedName("searchTerm")
    @Expose
    private String searchTerm;
    @SerializedName("isValid")
    @Expose
    private Boolean isValid;
    @SerializedName("virtualMachine")
    @Expose
    private String virtualMachine;
    @SerializedName("applications")
    @Expose
    private List<String> applications = null;
    @SerializedName("transmissionType")
    @Expose
    private String transmissionType;
    @SerializedName("administrationType")
    @Expose
    private String administrationType;
    @SerializedName("wiresharkNotes")
    @Expose
    private String wiresharkNotes;
    @SerializedName("comment")
    @Expose
    private String comment;

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public String getVirtualMachine() {
        return virtualMachine;
    }

    public void setVirtualMachine(String virtualMachine) {
        this.virtualMachine = virtualMachine;
    }

    public List<String> getApplications() {
        return applications;
    }

    public void setApplications(List<String> applications) {
        this.applications = applications;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getAdministrationType() {
        return administrationType;
    }

    public void setAdministrationType(String administrationType) {
        this.administrationType = administrationType;
    }

    public String getWiresharkNotes() {
        return wiresharkNotes;
    }

    public void setWiresharkNotes(String wiresharkNotes) {
        this.wiresharkNotes = wiresharkNotes;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString () {
        return "MacAddressDetails{" +
                "searchTerm='" + searchTerm + '\'' +
                ", isValid=" + isValid +
                ", virtualMachine='" + virtualMachine + '\'' +
                ", applications=" + applications +
                ", transmissionType='" + transmissionType + '\'' +
                ", administrationType='" + administrationType + '\'' +
                ", wiresharkNotes='" + wiresharkNotes + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
