package com.sploitfun.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int dollarinr_xchgrate = 68;
    char rupee_sym = '\u20B9';

    public void convertToINR(View view) {
        EditText dollar = (EditText) findViewById(R.id.dollarText);
        String user_inp = dollar.getText().toString();
        float user_inp_num = 0.0f;
        try {
            user_inp_num = Float.parseFloat(user_inp);
        } catch (Exception e) {
            Toast.makeText(this, "Wrong Input", Toast.LENGTH_LONG).show();
        }
        float out = user_inp_num * dollarinr_xchgrate;
        Toast.makeText(this, String.valueOf(rupee_sym)+" "+String.valueOf(out), Toast.LENGTH_LONG).show();
        Log.i("Info", "Button Clicked!!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
