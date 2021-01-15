package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEdittext,passwordEdittext;
    private Button loginbutton;
    private TextView textView;
    private int counter= 3;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEdittext=findViewById(R.id.usernameid);
        passwordEdittext=findViewById(R.id.passwordid);
        loginbutton=findViewById(R.id.loginbuttonid);
        textView=findViewById(R.id.textviewid);
        imageView2=findViewById(R.id.imageview2id);

        textView.setText("attempts remaining: 3");

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=usernameEdittext.getText().toString();
                String password=passwordEdittext.getText().toString();

                if (username.equals("admin") && password.equals("1234"))
                {
                    Intent intent = new Intent(MainActivity.this,NextActivity.class);
                    startActivity(intent);
                }
                else{
                   counter--;
                   textView.setText("attempts remaining: "+counter);
                   if (counter==0){
                       loginbutton.setEnabled(false);
                   }
                }
            }
        });
    }
}
