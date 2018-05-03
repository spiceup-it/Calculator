package com.example.yuzzle.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bc,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bminus,bmul,bdiv,bmod,bequal;
    private EditText t1;

    private int num1,num2;
    boolean add,sub,mul,div,mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bc=findViewById(R.id.buttonc);
        b0=findViewById(R.id.button0);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        bplus=findViewById(R.id.buttonplus);
        bminus=findViewById(R.id.buttonminus);
        bmul=findViewById(R.id.buttonmul);
        bdiv=findViewById(R.id.buttondiv);
        bmod=findViewById(R.id.buttonmod);
        bequal=findViewById(R.id.buttonequal);
        t1=findViewById(R.id.text1);

        bc.setOnClickListener(this);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bplus.setOnClickListener(this);
        bminus.setOnClickListener(this);
        bmul.setOnClickListener(this);
        bdiv.setOnClickListener(this);
        bmod.setOnClickListener(this);
        bequal.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option1:
                Toast.makeText(this, "option1 was selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.option2:
                Toast.makeText(this, "option2 was selectes", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        
        switch (view.getId()) {
            case R.id.buttonc:
                t1.setText("");
                break;
            case R.id.button0:
                t1.setText(t1.getText() + "0");
                break;
            case R.id.button1:
                t1.setText(t1.getText() + "1");
                break;
            case R.id.button2:
                t1.setText(t1.getText() + "2");
                break;
            case R.id.button3:
                t1.setText(t1.getText() + "3");
                break;
            case R.id.button4:
                t1.setText(t1.getText() + "4");
                break;
            case R.id.button5:
                t1.setText(t1.getText() + "5");
                break;
            case R.id.button6:
                t1.setText(t1.getText() + "6");
                break;
            case R.id.button7:
                t1.setText(t1.getText() + "7");
                break;
            case R.id.button8:
                t1.setText(t1.getText() + "8");
                break;
            case R.id.button9:
                t1.setText(t1.getText() + "9");
                break;
             case R.id.buttonplus:
                 num1 = Integer.parseInt(String.valueOf(t1.getText()));
                 add = true;
                 t1.setText(null);
                 break;
             case R.id.buttonminus:
                 num1 = Integer.parseInt(String.valueOf(t1.getText()));
                 sub = true;
                 t1.setText(null);
                 break;
             case R.id.buttonmul:
                 num1 = Integer.parseInt(String.valueOf(t1.getText()));
                 mul = true;
                 t1.setText(null);
                 break;
             case R.id.buttondiv:
                 num1 = Integer.parseInt(String.valueOf(t1.getText()));
                 div = true;
                 t1.setText(null);
                 break;
             case R.id.buttonmod:
                 num1 = Integer.parseInt(String.valueOf(t1.getText()));
                 mod = true;
                 t1.setText(null);
                 break;

                 //イコールが押された時に、ActivityResultに結果を表示する
             case R.id.buttonequal:
                 num2 = Integer.parseInt(String.valueOf(t1.getText()));
                 Intent intent = new Intent (MainActivity.this,ActivityResult.class);
                 if (add == true) {
                     t1.setText(String.valueOf(num1 + num2));
                     add = false;
                 } else if (sub == true) {
                     t1.setText(String.valueOf(num1 - num2));
                     sub = false;
                 } else if (mul == true) {
                     t1.setText(String.valueOf(num1 * num2));
                     mul = false;
                 } else if (div == true) {
                     t1.setText(String.valueOf(num1 / num2));
                     div = false;
                 } else if (mod == true) {
                     t1.setText(String.valueOf(num1 % num2));
                     mod = false;
                 } else {
                     t1.setText(null);
                 }
                 String data = t1.getText().toString();
                 /*intent.putExtra("data1",data);
                 setResult(3,intent);
                 finish();*/
                 break;

        }
    }
}
