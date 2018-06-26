package com.example.lenovo.advancecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText editText;
    TextView textView;
    boolean isNumber=false;
    boolean isOperator=false;
    boolean isAddition;
    boolean isSubtraction;
    boolean isDivision;
    boolean isMultiply;
    boolean ispercentage;
    float num1;
    float num2;
    boolean isStartMinus=false;
    boolean isStartPlus=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edittext);
        textView=findViewById(R.id.textView2);
        Button number0=findViewById(R.id.number0);
        Button number1=findViewById(R.id.number1);
        Button number2=findViewById(R.id.number2);
        Button number3=findViewById(R.id.number3);
        Button number4=findViewById(R.id.number4);
        Button number5=findViewById(R.id.number5);
        Button number6=findViewById(R.id.number6);
        Button number7=findViewById(R.id.number7);
        Button number8=findViewById(R.id.number8);
        Button number9=findViewById(R.id.number9);
        final Button add=findViewById(R.id.add);
        final Button minus=findViewById(R.id.minus);
        final Button divide=findViewById(R.id.divide);
        final Button multiply=findViewById(R.id.multiply);
        final Button percentage=findViewById(R.id.percentage);
        final Button point=findViewById(R.id.point);
        final Button equal=findViewById(R.id.equal);
        final Button C=findViewById(R.id.C);

        number0.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view)
            {
                isNumber=true;
                editText.setText(editText.getText()+"0");
                textView.setText(editText.getText());
            }
        });
        number1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                isNumber=true;


                    editText.setText(editText.getText() + "1");
                    textView.setText(editText.getText());
            }
        });
        number2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                  isNumber=true;
                   editText.setText(editText.getText() + "2");
                    textView.setText(editText.getText());

            }
        });
        number3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                isNumber = true;

                    editText.setText(editText.getText() + "3");
                    textView.setText(editText.getText());

            }
        });
        number4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                isNumber = true;

                    editText.setText(editText.getText() + "4");
                    textView.setText(editText.getText());
            }
        });
        number5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                isNumber = true;

                    editText.setText(editText.getText() + "5");
                    textView.setText(editText.getText());

            }
        });
        number6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                isNumber = true;

                    editText.setText(editText.getText() + "6");
                    textView.setText(editText.getText());

            }
        });
        number7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                isNumber=true;
                editText.setText(editText.getText() + "7");
                textView.setText(editText.getText());

            }
        });
        number8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "8");
                textView.setText(editText.getText());

            }
        });
        number9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                isNumber = true;
                    editText.setText(editText.getText() + "9");
                    textView.setText(editText.getText());
            }
        });
        point.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                editText.setText(editText.getText()+".");
                point.setEnabled(false);
                textView.setText(editText.getText());
            }
        });
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                isOperator=true;
                if(editText==null)
                {
                    isStartPlus=true;
                    editText.setText("");
                    textView.setText("0");
                }
                else
                {
                        num1 = Float.parseFloat(textView.getText() + "");
                        editText.setText("");
                        textView.setText("0");
                        isAddition=true;
                        textView.setText(String.valueOf(num1));
                }
            }
        });
       minus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               isOperator = true;
               if (editText == null) {
                   editText.setText("");
                   textView.setText("0");
               } else {
                   num1 = Float.parseFloat(textView.getText() + "");
                   editText.setText("");
                   textView.setText("0");
                   isSubtraction = true;
                   textView.setText(String.valueOf(num1));
               }
           }
       });
       multiply.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               isOperator=true;
               if(editText==null)
               {
                   editText.setText("");
                   textView.setText("0");
               }
               else
               {
                   num1 = Float.parseFloat(textView.getText() + "");
                   isStartMinus=false;
                   editText.setText("");
                   textView.setText("0");
                   isMultiply=true;
                   textView.setText(String.valueOf(num1));
               }
           }
       });
       divide.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(editText==null)
               {
                   editText.setText("");
                   textView.setText("0");
               }
               else
               {
                   num1 = Float.parseFloat(textView.getText() + "");
                   editText.setText("");
                   textView.setText("0");
                   isDivision=true;
                   textView.setText(String.valueOf(num1));
               }
           }
       });
       percentage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               isOperator=true;
               if(editText==null)
               {
                   editText.setText("");
                   textView.setText("0");
               }

               else{
                  num1 = Float.parseFloat(textView.getText() + "");
                   ispercentage=true;
                   editText.setText("");
                   textView.setText("0");
                   textView.setText(String.valueOf(num1));
               }
           }
       });
       equal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               num2=Float.parseFloat(editText.getText()+"");
               if(isAddition==true)
               {
                   textView.setText(String.valueOf(num1+num2));
               }
               if(isSubtraction==true)
               {
                   textView.setText(String.valueOf(num1-num2));
               }
               if(isMultiply==true)
               {
                   textView.setText(String.valueOf(num1*num2));
               }
               if(isDivision==true)
               {
                   textView.setText(String.valueOf(num1/num2));
               }
               if(ispercentage==true)
               {
                   textView.setText(String.valueOf(num1/100));
               }
           }
       });
       C.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText("0");
               textView.setText("");
               isNumber=false;
               isOperator=false;
               isAddition=false;
               isSubtraction=false;
               isDivision=false;
               isMultiply=false;
               ispercentage=false;
               isStartPlus=false;
               isStartMinus=false;
           }
       });
    }

}
