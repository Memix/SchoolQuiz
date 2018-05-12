package com.example.android.schoolquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int summon = 0;
    String answer = "atom";
    String answer1 = "Atom";
    String answer2 = "ATOM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioButton raido2 = findViewById(R.id.radio2);
                RadioButton radio1 = findViewById(R.id.radio1);
                RadioButton radio3 = findViewById(R.id.radio3);
                RadioButton radio4 = findViewById(R.id.radio4);
                RadioButton raido7 = findViewById(R.id.radio7);
                RadioButton radio5 = findViewById(R.id.radio5);
                RadioButton radio6 = findViewById(R.id.radio6);
                RadioButton radio8 = findViewById(R.id.radio8);
                CheckBox box2 = findViewById(R.id.box2);
                CheckBox box4 = findViewById(R.id.box4);
                CheckBox box1 = findViewById(R.id.box1);
                CheckBox box3 = findViewById(R.id.box3);
                EditText text = findViewById(R.id.text);
                if (raido2.isChecked()) {
                    summon = 1;
                }
                else if (radio1.isChecked() || radio3.isChecked() || radio4.isChecked()) {
                    summon = 0;
                }
                if (raido7.isChecked()) {
                    summon = summon + 1;
                }
                else if (radio5.isChecked() || radio6.isChecked() || radio8.isChecked()) {
                    summon = 0;
                }
                if (box2.isChecked() && box4.isChecked()) {
                    summon = summon + 1;
                }
                else if (box1.isChecked() && box3.isChecked() || box1.isChecked() && box3.isChecked() && box2.isChecked() && box4.isChecked() ||
                        box1.isChecked() && box2.isChecked() && box3.isChecked() || box1.isChecked() && box2.isChecked() && box4.isChecked() ||
                        box2.isChecked() && box3.isChecked() && box4.isChecked() || box1.isChecked() || box2.isChecked() || box3.isChecked() || box4.isChecked())
                {
                    summon = 0;
                }
                if (text.getText().toString().equals(answer) || text.equals(answer1) || text.equals(answer2)) {
                    summon = summon + 1;
                }

                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast result = Toast.makeText(context, String.valueOf(summon), duration);
                result.show();
            }

        });
    }
}

