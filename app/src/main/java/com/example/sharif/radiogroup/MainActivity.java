package com.example.sharif.radiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup_id);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.RadioButton_id:
                        Toast.makeText(getApplicationContext(),"Radio button 1",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.RadioButton2_id:
                        Toast.makeText(getApplicationContext(),"Radio button 2",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
