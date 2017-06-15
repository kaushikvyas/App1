package com.example.kaushik.app1;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity0 extends AppCompatActivity {

    Button done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_0);

        done = (Button)findViewById(R.id.button_Done);
        
        RadioGroup radioGroup_sex = (RadioGroup)findViewById(R.id.radioGroup);
        radioGroup_sex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                EditText editText_name = (EditText)findViewById(R.id.editText_name);
                final String name = editText_name.getText().toString();
                if (checkedId == R.id.radioButton_male){
                    Toast.makeText(getApplicationContext(), "Welcome Master "+ name +" !!", Toast.LENGTH_SHORT).show();
                }
                else if (checkedId == R.id.radioButton_female){
                    Toast.makeText(getApplicationContext(), "Welcome Miss "+ name +" !!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
