package com.example.gsonlibraryexample;

import com.google.gson.annotations.SerializedName;

public class Employee {
    //Digunakan jika String Key di JSON tidak sama dengan String di Object Employees
    @SerializedName("mFirst_Name")
    private String mFirstName;

    private int mAge;
    private String mMail;

    @SerializedName("address")
    private Address mAddress;

    public Employee(String mFirstName, int mAge, String mMail, Address mAddress) {
        this.mFirstName = mFirstName;
        this.mAge = mAge;
        this.mMail = mMail;
        this.mAddress = mAddress;
    }
}
