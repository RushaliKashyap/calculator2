package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button AC,btPlusMinus,one,two,three,four,five,six,seven,eight,nine,zero,per,Plus,Minus,mul,Divde,dot,equal;
    TextView textView;
    String process;
    Boolean Add,sub,Div,Mul,Mud;
    Float ans,res1,res2;
    void storePre(){
        res1 = Float.parseFloat(textView.getText()+"");
    }

    void setFalse()
    {
        Add=sub=Div=Mul= Mud =false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = findViewById(R.id.bt0);
        one = findViewById(R.id.bt1);
        two = findViewById(R.id.bt2);
        three = findViewById(R.id.bt3);
        four = findViewById(R.id.bt4);
        five = findViewById(R.id.bt5);
        six = findViewById(R.id.bt6);
        seven = findViewById(R.id.bt7);
        eight = findViewById(R.id.bt8);
        nine = findViewById(R.id.bt9);
        textView = findViewById(R.id.editText);
        AC = findViewById(R.id.btAC);
        Plus = findViewById(R.id.Plus);
        Minus = findViewById(R.id.Minus);
        mul = findViewById(R.id.btMul);
        Divde = findViewById(R.id.btDivide);
        per = findViewById(R.id.Per);
        dot = findViewById(R.id.btdot);
        equal = findViewById(R.id.Equal);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textView.getText().toString();

                textView.setText(process+"0");


            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textView.getText().toString();

                textView.setText(process+"1");


            }
        });
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");


            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textView.getText().toString();
                textView.setText(process+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textView.getText().toString();
                textView.setText(process+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textView.getText().toString();
                textView.setText(process+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textView.getText().toString();
                textView.setText(process+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textView.getText().toString();
                textView.setText(process+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textView.getText().toString();
                textView.setText(process+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textView.getText().toString();
                textView.setText(process+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textView.getText().toString();
                textView.setText(process+"9");
            }
        });

        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null)
                {
                    textView.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    Add=true;
                    textView.setText(null);
                }
            }
        });
        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null)
                {
                    textView.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    sub=true;
                    textView.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null)
                {
                    textView.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    Mul=true;
                    textView.setText(null);
                }
            }
        });
        Divde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null)
                {
                    textView.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    Div=true;
                    textView.setText(null);
                }
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null)
                {
                    textView.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    Mud=true;
                    textView.setText(null);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add)
                {
                    textView.setText(res1+Float.parseFloat(textView.getText()+"")+"");
                }
                if (sub)
                {
                    textView.setText(res1-Float.parseFloat(textView.getText()+"")+"");
                }
                if (Mul)
                {
                    textView.setText(res1*Float.parseFloat(textView.getText()+"")+"");
                }
                if (Div)
                {
                    textView.setText(res1/Float.parseFloat(textView.getText()+"")+"");
                }
                if (Mud)
                {
                    textView.setText(res1%Float.parseFloat(textView.getText()+"")+"");
                }
            }
        });


    }
}