package jp.techacademy.mitsuru.yamaura.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.support.design.widget.Snackbar;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    float x;
    float y;
    float z;

    EditText mEditText1;
    EditText mEditText2;

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

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);

    }

    @Override
    public void onClick(View v){

        Intent intent = new Intent(this,SecondActivity.class);

        //  文字列を取得する
        String s1 =mEditText1.getText().toString();
        String s2 =mEditText2.getText().toString();

        //  ここで数字以外の文字が入力されたらcatchする
        try {
            //  float型にキャストする
            x = Float.parseFloat(s1);
            y = Float.parseFloat(s2);

        } catch (NumberFormatException i){
            //  NumberFormatExceptionが出たらここで捕まえる
            //  iには例外の情報が入っている
            Snackbar.make(view, "残念。数字を入力してくださいね", Snackbar.LENGTH_LONG).show();
        }

        //  押したボタンに合わせて条件分岐してTextViewに表示する
        if(v.getId() == R.id.button1){

            z = x + y;
            intent.putExtra("VALUE1",z);
            startActivity(intent);

        }else if(v.getId() == R.id.button2){

            z = x-y;
            intent.putExtra("VALUE1",z);
            startActivity(intent);

        }else if(v.getId() == R.id.button3) {

            z = x * y;
            intent.putExtra("VALUE1",z);
            startActivity(intent);

        }else if(v.getId() == R.id.button4) {

            //  0の除算ができるのを回避する
            if (Y == 0) {
                Snackbar.make(view, "数字②には0以外を入力してね", Snackbar.LENGTH_LONG).show();
            } else {
                z = x / y;
                intent.putExtra("VALUE1", z);
                startActivity(intent);
            }
        }
    }
}
