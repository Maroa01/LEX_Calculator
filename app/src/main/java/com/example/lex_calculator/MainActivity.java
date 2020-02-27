package com.example.lex_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input, signBox;

    String sign, Function;
    String value1, value2;
    Double num1, num2, result;
    boolean hasDot, isSpecialFunction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        signBox = (TextView) findViewById(R.id.sign);

        hasDot = false;
        isSpecialFunction = false;

    }

    @SuppressLint("SetText18n")

    public void logs(View view){

    }
    public void In(View view){

    }
    public void xn(View view){

    }
    public void root(View view){

    }
    public void exe(View view){

    }
    public void sine(View view){

    }
    public void cosine(View view){

    }
    public void tan(View view){

    }

    public void DELETE(View view){

    }
    @SuppressLint("SetText18n")
    public void nine(View view){
        input.setText(input.getText()+"9");

    }
    @SuppressLint("SetText18n")
    public void eight (View view){
        input.setText(input.getText()+"8");

    }

    public void add(View view){

    }

    @SuppressLint("SetText18n")
    public void seven(View view){
        input.setText(input.getText()+"7");

    }

    public void C(View view){

    }

    public void subtract(View view){

    }
    @SuppressLint("SetText18n")
    public void five(View view){
        input.setText(input.getText()+"5");

    }

    @SuppressLint("SetText18n")
    public void four(View view){
        input.setText(input.getText()+"4");

    }

    @SuppressLint("SetText18n")
    public void three(View view){
        input.setText(input.getText()+"3");

    }

    @SuppressLint("SetText18n")
    public void two(View view){
        input.setText(input.getText()+"2");

    }

    @SuppressLint("SetText18n")
    public void one(View view){
        input.setText(input.getText()+"1");

    }

    @SuppressLint("SetText18n")
    public void zero(View view){
        input.setText(input.getText()+"0");

    }
    public void period(View view){

    }
    public void divide(View view){

    }
    public void six(View view){

    }
    public void multiply(View view){

    }
    public void equal(View view){

    }



}
