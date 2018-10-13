package jp.techacademy.mitsuru.yamaura.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
//import android.widget.TextView;
import android.widget.Button;
//import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button1.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("VALUE1",x);
        intent.putExtra("VALUE2",y);
        startActivity(intent);
    }
}
