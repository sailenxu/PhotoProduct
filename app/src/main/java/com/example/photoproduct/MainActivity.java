package com.example.photoproduct;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ojbk","create");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ojbk", "restart");
    }
}
