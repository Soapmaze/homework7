package com.example.soap.homework7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Homework7SimpleCalc extends AppCompatActivity {
    EditText input_num1;
    EditText input_num2;
    Button btn_plus;
    Button btn_minus;
    Button btn_multiply;
    Button btn_divide;
    TextView txtview_result;
    int calc_result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework7_simple_calc);

        input_num1 = (EditText) findViewById(R.id.input_num1);
        input_num2 = (EditText) findViewById(R.id.input_num2);
        btn_plus = (Button) findViewById(R.id.btn_Plus);
        btn_minus = (Button) findViewById(R.id.btn_Minus);
        btn_multiply = (Button) findViewById(R.id.btn_Multiply);
        btn_divide = (Button) findViewById(R.id.btn_Divide);
        txtview_result = (TextView) findViewById(R.id.txtView_Result);

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc_result = Integer.parseInt(input_num1.getText().toString()) + Integer.parseInt(input_num2.getText().toString());
                txtview_result.setText("Result : " + String.valueOf(calc_result));
            }
        });
    }
}
