package com.example.calculator;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input1, input2;
    Button mytBtn;
    TextView myResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.number1);
        input2 = findViewById(R.id.number2);
        mytBtn = findViewById(R.id.sum);
        myResult = findViewById(R.id.result);


        mytBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if (TextUtils.isDigitsOnly(input1.getText().toString())
                        && TextUtils.isDigitsOnly(input1.getText().toString())
                        && !TextUtils.isEmpty(input1.getText().toString())
                        && !TextUtils.isEmpty(input1.getText().toString())
                ) {
                    double n1 = Double.parseDouble(input1.getText().toString());
                    double n2 = Double.parseDouble(input2.getText().toString());
                    myResult.setText("Result " + (n1 + n2));
                    myResult.setTextColor(getColor(R.color.purple_700));

                    input1.setText("");
                    input2.setText("");
                    Toast.makeText(getApplicationContext(), "operation done", Toast.LENGTH_LONG).show();
                }else {
                    input1.setText("");
                    input2.setText("");
                    myResult.setTextColor(Color.RED);
                    myResult.setText("please enter a number");
                    Toast.makeText(getApplicationContext(), "ERROR", Toast.LENGTH_LONG).show();
                }


            }
        });

    }

}