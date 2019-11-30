package com.example.admin.radiobutton;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    String r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=(RadioGroup)findViewById(R.id.RootRadio);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i)
            {
                switch (i)
                {
                    case R.id.cash:
                        r1="cash";
                        Toast.makeText(MainActivity.this, r1, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.card:
                        r2="card";
                        Toast.makeText(MainActivity.this, r2, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
