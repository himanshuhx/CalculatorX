package com.first75494.calculatorx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private Button addBtn;
    private Button subBtn;
    private Button mulBtn;
    private Button divBtn;
    private Button clear;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1=findViewById(R.id.input1);
        input2=findViewById(R.id.input2);
        addBtn=findViewById(R.id.addbtn);
        mulBtn=findViewById(R.id.mulbtn);
        subBtn=findViewById(R.id.subbtn);
        mulBtn=findViewById(R.id.divbtn);
        result=findViewById(R.id.result);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(input1.getText().length()>0 && input2.getText().length()>0){
                Double inputF=Double.parseDouble(input1.getText().toString());
                Double inputS=Double.parseDouble(input2.getText().toString());

                Double resultF=inputF + inputS;

                result.setText(Double.toString(resultF));
            }else{
                    Toast.makeText(MainActivity.this,"Please Enter Valid Inputs",Toast.LENGTH_SHORT);
                }

            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(input1.getText().length()>0 && input2.getText().length()>0){
                    Double inputF=Double.parseDouble(input1.getText().toString());
                    Double inputS=Double.parseDouble(input2.getText().toString());

                    Double resultF=inputF - inputS;

                    result.setText(Double.toString(resultF));
                }else{
                    Toast.makeText(MainActivity.this,"Please Enter Valid Inputs",Toast.LENGTH_SHORT);
                }

            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(input1.getText().length()>0 && input2.getText().length()>0){
                    Double inputF=Double.parseDouble(input1.getText().toString());
                    Double inputS=Double.parseDouble(input2.getText().toString());

                    Double resultF=inputF * inputS;

                    result.setText(Double.toString(resultF));
                }else{
                    Toast.makeText(MainActivity.this,"Please Enter Valid Inputs",Toast.LENGTH_SHORT);
                }

            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(input1.getText().length()>0 && input2.getText().length()>0){
                    Double inputF=Double.parseDouble(input1.getText().toString());
                    Double inputS=Double.parseDouble(input2.getText().toString());

                    Double resultF=inputF / inputS;

                    result.setText(Double.toString(resultF));
                }else{
                    Toast.makeText(MainActivity.this,"Please Enter Valid Inputs",Toast.LENGTH_SHORT);
                }

            }
        });
    }
}
