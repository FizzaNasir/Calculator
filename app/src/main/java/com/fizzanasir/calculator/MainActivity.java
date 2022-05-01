package com.fizzanasir.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, mul, div, eq;
TextView input, output;
String in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=findViewById(R.id.Num1);
        one.setOnClickListener(this);
        two=findViewById(R.id.Num2);
        two.setOnClickListener(this);
        three=findViewById(R.id.Num3);
        three.setOnClickListener(this);
        four=findViewById(R.id.Num4);
        four.setOnClickListener(this);
        five=findViewById(R.id.Num5);
        five.setOnClickListener(this);
        six=findViewById(R.id.Num6);
        six.setOnClickListener(this);
        seven=findViewById(R.id.Num7);
        seven.setOnClickListener(this);
        eight=findViewById(R.id.Num8);
        eight.setOnClickListener(this);
        nine=findViewById(R.id.Num9);
        nine.setOnClickListener(this);
        zero=findViewById(R.id.Num0);
        zero.setOnClickListener(this);
        plus=findViewById(R.id.plus);
        plus.setOnClickListener(this);
        minus=findViewById(R.id.minus);
        minus.setOnClickListener(this);
        div=findViewById(R.id.divide);
        div.setOnClickListener(this);
        mul=findViewById(R.id.mul);
        mul.setOnClickListener(this);
        eq=findViewById(R.id.equal);
        eq.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
             if(one.isPressed())
             {
                 input.setText(input.getText()+"1");
             }
             else if(two.isPressed())
             {
                 input.setText(input.getText()+"2");
             }
             else if(three.isPressed())
             {
                 input.setText(input.getText()+"3");
             }
             else if(four.isPressed())
             {
                 input.setText(input.getText()+"4");
             }
             else if(five.isPressed())
             {
                 input.setText(input.getText()+"5");
             }
             else if(six.isPressed())
             {
                 input.setText(input.getText()+"6");
             }
             else if(seven.isPressed())
             {
                 input.setText(input.getText()+"7");
             }
             else if(eight.isPressed())
             {
                 input.setText(input.getText()+"8");
             }
             else if(nine.isPressed())
             {
                 input.setText(input.getText()+"9");
             }
             else if(plus.isPressed())
             {
                 input.setText(input.getText()+"+");
             }
             else if(minus.isPressed())
             {
                 input.setText(input.getText()+"-");
             }
             else if(div.isPressed())
             {
                 input.setText(input.getText()+"/");
             }
             else if(mul.isPressed())
             {
                 input.setText(input.getText()+"X");
             }
    }
}