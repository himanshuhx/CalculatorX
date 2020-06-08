package com.first75494.calculatorx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input1;  //Initialising The Views
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

        input1=findViewById(R.id.input1);  //Finding Each Views By Their Id's
        input2=findViewById(R.id.input2);
        addBtn=findViewById(R.id.addbtn);
        mulBtn=findViewById(R.id.mulbtn);
        subBtn=findViewById(R.id.subbtn);
        divBtn=findViewById(R.id.divbtn);
        clear=findViewById(R.id.clrbtn);
        result=findViewById(R.id.resultview);

        addBtn.setOnClickListener(new View.OnClickListener() {  //Setting On Click Listener For Add Button
            @Override
            public void onClick(View v) {

                if(input1.getText().length()>0 && input2.getText().length()>0){
                Double inputF=Double.parseDouble(input1.getText().toString()); //Parsing String Value To Double Value
                Double inputS=Double.parseDouble(input2.getText().toString());

                Double resultF=inputF + inputS;

                result.setText(Double.toString(resultF));
            }else{
                    Toast.makeText(MainActivity.this,"Please Enter Valid Inputs",Toast.LENGTH_SHORT).show(); //Displays a Toast Message When User Tries To Perform
                }                                                                                                         //Operations Without Providing Another Input

            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {  //Setting On Click Listener For Subtraction Button
            @Override
            public void onClick(View v) {

                if(input1.getText().length()>0 && input2.getText().length()>0){
                    Double inputF=Double.parseDouble(input1.getText().toString());   //Parsing String Value To Double Value
                    Double inputS=Double.parseDouble(input2.getText().toString());

                    Double resultF=inputF - inputS;  //Performing Subtraction

                    result.setText(Double.toString(resultF));
                }else{
                    Toast.makeText(MainActivity.this,"Please Enter Valid Inputs",Toast.LENGTH_SHORT).show();   //Displays a Toast Message When User Tries To Perform
                }                                                                                                            //Operations Without Providing Another Input

            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {  //Setting On Click Listener For Multiplication Button
            @Override
            public void onClick(View v) {

                if(input1.getText().length()>0 && input2.getText().length()>0){
                    Double inputF=Double.parseDouble(input1.getText().toString());   //Parsing String Value To Double Value
                    Double inputS=Double.parseDouble(input2.getText().toString());

                    Double resultF=inputF * inputS;

                    result.setText(Double.toString(resultF));
                }else{
                    Toast.makeText(MainActivity.this,"Please Enter Valid Inputs",Toast.LENGTH_SHORT).show();     //Displays a Toast Message When User Tries To Perform
                }                                                                                                              //Operations Without Providing Another Input

            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {  //Setting On Click Listener For Division Button
            @Override
            public void onClick(View v) {

                if(input1.getText().length()>0 && input2.getText().length()>0){
                    Double inputF=Double.parseDouble(input1.getText().toString());  //Parsing String Value To Double Value
                    Double inputS=Double.parseDouble(input2.getText().toString());

                    Double resultF=inputF / inputS;

                    result.setText(Double.toString(resultF));
                }else{
                    Toast.makeText(MainActivity.this,"Please Enter Valid Inputs",Toast.LENGTH_SHORT).show();  //Displays a Toast Message When User Tries To Perform
                }                                                                                                           //Operations Without Providing Another Input

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {  //Setting On Click Listener For Clear Button
        @Override
            public void onClick(View v) {
                input1.setText(""); //Setting First Input As Empty String
                input2.setText("");  //Setting Second Input As Empty String
                result.setText("0.00");  //Setting The Result Back To 0.00
                input1.requestFocus();  //Moving the Cursor Back To Our First Input
            }
        });
    }
}
