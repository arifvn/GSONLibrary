package com.example.gsonlibraryexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        Address address = new Address("Indonesia", "Semarang");

        List<FamilyMember> familyMembers = new ArrayList<>();
        familyMembers.add(new FamilyMember("Wife", 30));
        familyMembers.add(new FamilyMember("Daughter", 15));

        //SERIALIZATION (convert Java Object to  JSON format)
        Employee employee = new Employee("M", 21, "arifin@gmail.com", address, familyMembers);
        String json = gson.toJson(familyMembers);

        //DE SERIALIZATION (convert JSON to Java Object)
        String mJson = "{\"address\":{\"mCity\":\"Semarang\",\"mCountry\":\"Indonesia\"},\"mAge\":21,\"family\":[{\"mAge\":30,\"mRole\":\"Wife\"},{\"mAge\":15,\"mRole\":\"Daughter\"}],\"mFirst_Name\":\"M\",\"mMail\":\"arifin@gmail.com\"}";
        Employee employee1 = gson.fromJson(mJson, Employee.class);

        //FROM JSON TO ARRAY
        String jsonArray = "[{\"mAge\":30,\"mRole\":\"Wife\"},{\"mAge\":15,\"mRole\":\"Daughter\"}]";
        FamilyMember[] familyMembersArray = gson.fromJson(jsonArray, FamilyMember[].class);

        //FROM JSON TO ARRAY LIST
        String jsonArray1 = "[{\"mAge\":30,\"mRole\":\"Wife\"},{\"mAge\":15,\"mRole\":\"Daughter\"}]";
        Type familyType = new TypeToken<ArrayList<FamilyMember>>(){}.getType();
        ArrayList<FamilyMember> familyMemberList = gson.fromJson(jsonArray1, familyType);


    }
}
