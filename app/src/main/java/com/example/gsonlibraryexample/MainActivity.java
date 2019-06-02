package com.example.gsonlibraryexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        //SERIALIZATION (convert Java Object to JSON format)
        Employee employee = new Employee("M", 21, "arifin@gmail.com");
        String json = gson.toJson(employee);

        //DE SERIALIZATION (convert JSON to Java Object)
        String mJson = "{\"mAge\":21, \"mFirst_Name\":\"M\", \"mMail\":\"arifin@gmail.com\"}";
        Employee employee1 = gson.fromJson(mJson, Employee.class);

    }
}
