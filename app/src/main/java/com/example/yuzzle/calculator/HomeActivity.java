package com.example.yuzzle.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    private EditText e1;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        e1=findViewById(R.id.edittext1);
        b1=findViewById(R.id.button1);
    }

    public void clickButton(View view) {
        String data=e1.getText().toString();
        Bundle b=new Bundle();
        b.putString("data1",data);
        Intent intent = new Intent (HomeActivity.this,ActivityResult.class);
        intent.putExtras(b);
       // setResult(2,intent);
        //finish();
       startActivity(intent);
    }
}
