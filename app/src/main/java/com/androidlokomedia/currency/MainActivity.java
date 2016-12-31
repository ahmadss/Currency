package com.androidlokomedia.currency;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        Double Rupiah = Double.parseDouble(editText.getText().toString());
        Double Rupiahkedolar = Rupiah * 10000;
        Toast.makeText(getApplicationContext(),Rupiahkedolar.toString(),Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onClick: "+Rupiahkedolar.toString());
    }
}
