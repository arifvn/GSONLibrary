package com.example.gsonlibraryexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    //Digunakan jika String Key di JSON tidak sama dengan String di Object Employees
    @SerializedName("mFirst_Name")
    private String mFirstName;

    @SerializedName("age")
    private int mAge;
    private String mMail;

    @SerializedName("address")
    private Address mAddress;

    @SerializedName("family")
    private List<FamilyMember> mFamilyMembers;

    public Employee(String mFirstName, int mAge, String mMail, Address mAddress, List<FamilyMember> mFamilyMembers) {
        this.mFirstName = mFirstName;
        this.mAge = mAge;
        this.mMail = mMail;
        this.mAddress = mAddress;
        this.mFamilyMembers = mFamilyMembers;
    }
}
