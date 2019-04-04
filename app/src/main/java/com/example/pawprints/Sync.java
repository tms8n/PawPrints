package com.example.pawprints;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Sync extends AppCompatActivity {
    EditText numberText;
    SharedPreferences sharedPreferences;
    public static final String PhoneNumber = "numberKey";
    public static final String MyPREFERENCES = "MyPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sync);
        numberText = findViewById(R.id.numberText);
        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
    }

    public void enterPhoneNumber(View view){
        String number = numberText.getText().toString();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PhoneNumber, number);
        editor.apply();
        startActivity(new Intent(getApplicationContext(), MenuActivity.class));
    }
}
