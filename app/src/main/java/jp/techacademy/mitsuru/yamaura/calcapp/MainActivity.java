package jp.techacademy.mitsuru.yamaura.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
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
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, SecondActivity.class);

        //  文字列を取得する
        String s1 = mEditText1.getText().toString();
        String s2 = mEditText2.getText().toString();

        //  ここで数字以外の文字が入力されたらcatchする
        //try {
            //  float型にキャストする
            //x = Float.parseFloat(s1);
            //y = Float.parseFloat(s2);

        //} catch (NumberFormatException i) {
            //  NumberFormatExceptionが出たらここで捕まえる
            //  iには例外の情報が入っている
            //Snackbar.make(v, "残念。数字を入力してくださいね", Snackbar.LENGTH_INDEFINITE).show();
            //return;
        //}

        //  EditTextに文字の入力がない状態でボタンを操作した場合
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)) {

            Snackbar.make(v, "残念。数字を入力してくださいね", Snackbar.LENGTH_INDEFINITE).show();
            return;

        }else {

            //  float型にキャストする
            x = Float.parseFloat(s1);
            y = Float.parseFloat(s2);

            //  押したボタンに合わせて条件分岐してTextViewに表示する
            if (v.getId() == R.id.button1) {

                z = x + y;
                intent.putExtra("VALUE1", z);
                startActivity(intent);

            } else if (v.getId() == R.id.button2) {

                z = x - y;
                intent.putExtra("VALUE1", z);
                startActivity(intent);

            } else if (v.getId() == R.id.button3) {

                z = x * y;
                intent.putExtra("VALUE1", z);
                startActivity(intent);

            } else if (v.getId() == R.id.button4) {

                //  0の除算ができるのを回避する
                if (y == 0) {
                    Snackbar.make(v, "数字②には0以外を入力してね", Snackbar.LENGTH_INDEFINITE).show();
                } else {
                    z = x / y;
                    intent.putExtra("VALUE1", z);
                    startActivity(intent);
                }
            }
        }
    }
}
