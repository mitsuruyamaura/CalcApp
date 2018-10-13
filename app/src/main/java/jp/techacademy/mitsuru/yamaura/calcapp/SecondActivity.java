package jp.techacademy.mitsuru.yamaura.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.View;
import android.content.Intent;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        float value1 = intent.getFloatExtra("VALUE1",0);
        float value2 = intent.getFloatExtra("VALUE2",0);
        TextView textView = (TextView) findViewById(R.id.textView2);

        //  押したボタンに合わせて条件分岐
        if(v.getId() == R.id.button1){

            textView2.setText(String.valueOf(value1 + value2));

        }else if(v.getId() == R.id.button2){

            textView2.setText(String.valueOf(value1 - value2));

        }else if(v.getId() == R.id.button3) {

            textView2.setText(String.valueOf(value1 * value2));

        }else if(v.getId() == R.id.button4){

            textView2.setText(String.valueOf(value1 / value2));
        }
    }
}
