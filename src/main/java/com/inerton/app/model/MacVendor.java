package com.inerton.app.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MacVendor {

    @SerializedName("vendorDetails")
    @Expose
    private VendorDetails vendorDetails;
    @SerializedName("blockDetails")
    @Expose
    private BlockDetails blockDetails;
    @SerializedName("macAddressDetails")
    @Expose
    private MacAddressDetails macAddressDetails;

    public VendorDetails getVendorDetails () {
        return vendorDetails;
    }

    public void setVendorDetails (VendorDetails vendorDetails) {
        this.vendorDetails = vendorDetails;
    }

    public BlockDetails getBlockDetails () {
        return blockDetails;
    }

    public void setBlockDetails (BlockDetails blockDetails) {
        this.blockDetails = blockDetails;
    }

    public MacAddressDetails getMacAddressDetails () {
        return macAddressDetails;
    }

    public void setMacAddressDetails (MacAddressDetails macAddressDetails) {
        this.macAddressDetails = macAddressDetails;
    }

    @Override
    public String toString () {
        return "MacVendor{" +
                "vendorDetails=" + vendorDetails +
                ", blockDetails=" + blockDetails +
                ", macAddressDetails=" + macAddressDetails +
                '}';
    }
}



