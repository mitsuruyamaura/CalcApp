package jp.techacademy.mitsuru.yamaura.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    float value1;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        value1 = intent.getFloatExtra("VALUE1",0);

        textView = (TextView) findViewById(R.id.textView2);
        textView.setText(String.valueOf(value1));
    }
}
