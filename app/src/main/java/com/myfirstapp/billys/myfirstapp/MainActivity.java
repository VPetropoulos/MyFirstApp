package com.myfirstapp.billys.myfirstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView titel;
    Button rot;
    Button gelb;
    Button ende;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titel = (TextView) findViewById(R.id.textView_titel);
        rot = (Button) findViewById(R.id.button_rot);
        gelb = (Button) findViewById(R.id.button_gelb);
        ende = (Button) findViewById(R.id.button_ende);

        rot.setOnClickListener(this);
        gelb.setOnClickListener(this);
        ende.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {

            case R.id.button_rot:
            {
                titel.setBackgroundColor(Color.RED);
                break;
            }
            case R.id.button_gelb:
            {
                titel.setBackgroundColor(Color.YELLOW);
                break;

            }
            case R.id.button_ende:
            {
                finish();
                break;
            }
        }
    }
}
