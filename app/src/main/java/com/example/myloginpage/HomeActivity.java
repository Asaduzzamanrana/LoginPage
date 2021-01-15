package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button showbutton;
    private TextView showtext;
    private ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        radioGroup=findViewById(R.id.RadioGroupId);
        showbutton=findViewById(R.id.ShowButtonId);
        showtext=findViewById(R.id.textviewid);
        imageView3=findViewById(R.id.imageview3id);


        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(selectedId);
                String value=radioButton.getText().toString();
                showtext.setText(value);
            }
        });
    }
}
