package com.example.lex_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView input, signBox;

    String sign, specialFunction;
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
        isSpecialFunction = true;
        specialFunction = "log";
        input.setText(null);
        hasDot = false;
        signBox.setText("log");
    }
    public void In(View view){
        isSpecialFunction = true;
        specialFunction = "In";
        input.setText(null);
        hasDot = false;
        signBox.setText("In");


    }
    public void xn(View view){
        isSpecialFunction = true;
        specialFunction = "power";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signBox.setText("x^");


    }
    public void root(View view){
        isSpecialFunction = true;
        specialFunction = "root";
        input.setText(null);
        hasDot = false;
        signBox.setText("√");

    }
    public void exe(View view){
        isSpecialFunction = true;
        specialFunction = "factorial";
        input.setText(null);
        hasDot = false;
        signBox.setText("!");


    }
    public void sine(View view){
        isSpecialFunction = true;
        specialFunction = "sin";
        input.setText(null);
        hasDot = false;
        signBox.setText("sin");

    }
    public void cosine(View view){
        isSpecialFunction = true;
        specialFunction = "cos";
        input.setText(null);
        hasDot = false;
        signBox.setText("cos");

    }
    public void tan(View view){
        isSpecialFunction = true;
        specialFunction = "tan";
        input.setText(null);
        hasDot = false;
        signBox.setText("tan");

    }

    public void DELETE(View view){
        if(input.getText().equals("")) {
            input.setText(null);
        }
            else
            {
                int len = input.getText().length();
                String s = input.getText().toString();
                if (s.charAt(len-1)=='.') {
                    hasDot=false;
                    input.setText(input.getText().subSequence(0,input.getText().length()-1));
                }
                else
                {
                    input.setText(input.getText().subSequence(0,input.getText().length()-1));
                }
            }
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
        sign = "+";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signBox.setText("+");
    }

    @SuppressLint("SetText18n")
    public void seven(View view){
        input.setText(input.getText()+"7");

    }

    public void C(View view){

    }

    public void subtract(View view){
        sign = "-";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signBox.setText("-");
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
        if(!hasDot){
            if (input.getText().equals("")){
                input.setText("0.");
            }
            else {
                input.setText(input.getText()+".");
            }
            hasDot=true;
        }

    }
    public void divide(View view){
        sign = "/";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signBox.setText("/");

    }
    public void six(View view){

    }
    public void multiply(View view){
        sign = "*";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signBox.setText("*");

    }
    public void equal(View view){
        if((specialFunction == null && sign == null) || (input.getText().equals(""))){
            signBox.setText("Error");
        }
        else if (specialFunction != null){
            switch (specialFunction){
                default:
                    break;
                case "sin":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sin(num1)+"");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signBox.setText(null);
                    break;
                case "cos":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.cos(num1)+"");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signBox.setText(null);
                    break;
                case "tan":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.tan(num1)+"");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signBox.setText(null);
                    break;
                case "root":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sqrt(num1)+"");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signBox.setText(null);
                    break;
                case "log":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.log10(num1)+"");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signBox.setText(null);
                    break;
                case "In":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.log(num1)+"");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signBox.setText(null);
                    break;
                case "power":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    num2 = Double.parseDouble((value2));
                    input.setText(Math.pow(num1,num2)+"");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signBox.setText(null);
                    break;
                case "factorial":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    int i = Integer.parseInt(value1)-1;

                    while (i>0) {
                        num1 = num1 *i;
                        i--;
                    }
                    input.setText(Math.pow(num1,num2)+"");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signBox.setText(null);
                    break;

            }
            if (sign != null){
                value2 = input.getText().toString();

                num1 = Double.parseDouble((value1));
                num2 = Double.parseDouble((value2));
                input.setText(null);

                switch (sign){
                    default:
                        break;
                    case "+":
                        result = num1+num2;
                        sign = null;
                        signBox.setText(null);
                        break;
                    case "-":
                        result = num1-num2;
                        sign = null;
                        signBox.setText(null);
                        break;
                    case "/":
                        result = num1/num2;
                        sign = null;
                        signBox.setText(null);
                        break;
                    case "*":
                        result = num1*num2;
                        sign = null;
                        signBox.setText(null);
                        break;
                }
            }
            else{
                signBox.setText("Error");
            }
        }
    }
}
