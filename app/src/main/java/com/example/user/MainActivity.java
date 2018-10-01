package com.example.user;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view){
        // Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view){
        // textview 요소를 가져온다.
        TextView showCountTextView=
                (TextView) findViewById(R.id.textView);

        //저장된 요소에서 value를 가져온다.
        String countString = showCountTextView.getText().toString();

        //value를 int로 변환하고 증가시킨다.
        Integer count = Integer.parseInt(countString);
        count++;

        //새로운 value인 count값을 textview에 보이게 만든다.
        showCountTextView.setText(count.toString());
    }

    private static final String TOTAL_COUNT = "total_count";

    public void randomMe(View view){
        //secondactivitiy를 실행할 Intent를 만든다.
        Intent randomIntent = new Intent(this, SecondActivity.class);
        TextView showCountTextview = (TextView) findViewById(R.id.textView);

        String countString = showCountTextview.getText().toString();

        int count = Integer.parseInt(countString);

        randomIntent.putExtra(TOTAL_COUNT,count);

        //새로운 activity를 시작한다.
        startActivity(randomIntent);
    }
}
