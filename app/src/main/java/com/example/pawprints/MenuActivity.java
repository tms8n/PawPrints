package com.example.pawprints;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.pawprints.Sync.MyPREFERENCES;
import static com.example.pawprints.Sync.PhoneNumber;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public void onResume(){
        super.onResume();
        TextView t = (TextView) findViewById(R.id.textView2);
        SharedPreferences sharedPreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
        t.setText(sharedPreferences.getString(PhoneNumber,""));

    }

    public void openSyncActivity(View view){
        startActivity(new Intent(getApplicationContext(), Sync.class));
    }
}
