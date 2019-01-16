package com.example.admin.subtract;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button Sub;
    private EditText Num1;
    private EditText Num2;
    private EditText Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sub = findViewById(R.id.btnSub);
        Num1 = findViewById(R.id.etNum1);
        Num2 = findViewById(R.id.etNum2);
        Result = findViewById(R.id.etResult);

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,c;
                a = Double.parseDouble(Num1.getText().toString());
                b = Double.parseDouble(Num2.getText().toString());
                c = a-b;
                Result.setText(Double.toString(c));
            }
        });
    }
}
