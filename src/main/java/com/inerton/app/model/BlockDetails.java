package com.inerton.app.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlockDetails {

    @SerializedName("blockFound")
    @Expose
    private Boolean blockFound;
    @SerializedName("borderLeft")
    @Expose
    private String borderLeft;
    @SerializedName("borderRight")
    @Expose
    private String borderRight;
    @SerializedName("blockSize")
    @Expose
    private Integer blockSize;
    @SerializedName("assignmentBlockSize")
    @Expose
    private String assignmentBlockSize;
    @SerializedName("dateCreated")
    @Expose
    private String dateCreated;
    @SerializedName("dateUpdated")
    @Expose
    private String dateUpdated;

    public Boolean getBlockFound() {
        return blockFound;
    }

    public void setBlockFound(Boolean blockFound) {
        this.blockFound = blockFound;
    }

    public String getBorderLeft() {
        return borderLeft;
    }

    public void setBorderLeft(String borderLeft) {
        this.borderLeft = borderLeft;
    }

    public String getBorderRight() {
        return borderRight;
    }

    public void setBorderRight(String borderRight) {
        this.borderRight = borderRight;
    }

    public Integer getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    public String getAssignmentBlockSize() {
        return assignmentBlockSize;
    }

    public void setAssignmentBlockSize(String assignmentBlockSize) {
        this.assignmentBlockSize = assignmentBlockSize;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString () {
        return "BlockDetails{" +
                "blockFound=" + blockFound +
                ", borderLeft='" + borderLeft + '\'' +
                ", borderRight='" + borderRight + '\'' +
                ", blockSize=" + blockSize +
                ", assignmentBlockSize='" + assignmentBlockSize + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", dateUpdated='" + dateUpdated + '\'' +
                '}';
    }
}
