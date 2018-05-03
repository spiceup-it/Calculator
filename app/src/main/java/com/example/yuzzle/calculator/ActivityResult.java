package com.example.yuzzle.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {

    private TextView t1;
    private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t1=findViewById(R.id.textresult);
        b2=findViewById(R.id.button2);

        /*Intent i=getIntent();
        String d=i.getStringExtra("data1");
        t1.setText(d);*/

        //Bundleは相互のやりとりというわけではない
        Bundle bundle=getIntent().getExtras();
        String d=bundle.getString("data1","abcd");
        t1.setText(d);

    }

    public void pushButton (View view){
        Intent i=new Intent(ActivityResult.this,HomeActivity.class);
        startActivity(i);


    }

    /*public void pushButton (View view){
        Intent i=new Intent(ActivityResult.this,HomeActivity.class);
        startActivity(i);
        startActivityForResult(i,2);


        Intent i=new Intent(ActivityResult.this,MainActivity.class);
        //→このアクティビティと接続する橋を作成する。
        startActivityForResult(i,3);
        //→繋がったアクティビティとの処理を定義する。
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent i) {
        super.onActivityResult(requestCode, resultCode, i);

        if(requestCode==2)//if(requestCode==3)
        {
            Bundle bundle=getIntent().getExtras();
            String d=bundle.getString("data1","abcd");
            t1.setText(d);
        }
    }*/
}
