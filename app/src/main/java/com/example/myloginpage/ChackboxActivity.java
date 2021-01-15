package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ChackboxActivity extends AppCompatActivity {

    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9;
    private Button button1,button2,button3;
    private TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chackbox);

        checkBox1= findViewById(R.id.checkbox1id);
        checkBox2= findViewById(R.id.checkbox2id);
        checkBox3= findViewById(R.id.checkbox3id);
        checkBox4= findViewById(R.id.checkbox4id);
        checkBox5= findViewById(R.id.checkbox5id);
        checkBox6= findViewById(R.id.checkbox6id);
        checkBox7= findViewById(R.id.checkbox7id);
        checkBox8= findViewById(R.id.checkbox8id);
        checkBox9= findViewById(R.id.checkbox9id);

        button1=findViewById(R.id.button1id);
        button2=findViewById(R.id.button2id);
        button3=findViewById(R.id.button3id);

        textView1= findViewById(R.id.text1id);
        textView2= findViewById(R.id.text2id);
        textView3= findViewById(R.id.text3id);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder builder1= new StringBuilder();

                if (checkBox1.isChecked()){
                    String value= checkBox1.getText().toString();
                    builder1.append(value+ " is best ");
                }
                if (checkBox2.isChecked()){
                    String value= checkBox2.getText().toString();
                    builder1.append(value+ " is best ");
                }
                if (checkBox3.isChecked()){
                    String value= checkBox3.getText().toString();
                    builder1.append(value+ " is best ");
                }


                textView1.setText(builder1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder builder2= new StringBuilder();
                if (checkBox4.isChecked()){
                    String value= checkBox4.getText().toString();
                    builder2.append(" My name is "+value);
                }
                if (checkBox5.isChecked()){
                    String value= checkBox5.getText().toString();
                    builder2.append(" My name is "+value);
                }
                if (checkBox6.isChecked()){
                    String value= checkBox6.getText().toString();
                    builder2.append(" My name is "+value);
                }
                textView2.setText(builder2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder builder3= new StringBuilder();

                if (checkBox7.isChecked()){
                    String value= checkBox7.getText().toString();
                    builder3.append(value+ " love me ");
                }
                if (checkBox8.isChecked()){
                    String value= checkBox8.getText().toString();
                    builder3.append(value+ " love me ");
                }
                if (checkBox9.isChecked()){
                    String value= checkBox9.getText().toString();
                    builder3.append(value+ " love me ");
                }


                textView3.setText(builder3);
            }
        });

    }
}
