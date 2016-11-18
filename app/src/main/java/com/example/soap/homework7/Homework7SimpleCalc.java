package com.example.soap.homework7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Homework7SimpleCalc extends AppCompatActivity {
    EditText input_num1;
    EditText input_num2;
    Button btn_plus;
    Button btn_minus;
    Button btn_multiply;
    Button btn_divide;
    Button btn_mod;
    TextView txtview_result;
    double num1 =0, num2 = 0;
    double calc_result=0;
    View.OnClickListener ClickListen;

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
        btn_mod = (Button) findViewById(R.id.btn_Mod);
        txtview_result = (TextView) findViewById(R.id.txtView_Result);

        ClickListen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input_num1.getText().toString().equals("") || input_num2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 넣으세요.", Toast.LENGTH_LONG).show();
                }
                else {
                    num1 = Double.parseDouble(input_num1.getText().toString());
                    num2 = Double.parseDouble(input_num2.getText().toString());
                }
                switch (v.getId()) {
                    case R.id.btn_Plus :

                        calc_result = num1 + num2;
                        break;
                    case R.id.btn_Minus :
                        calc_result = num1 - num2;
                        break;
                    case R.id.btn_Multiply :
                        calc_result = num1 * num2;
                        break;
                    case R.id.btn_Divide :
                        if(num2 == 0) {
                            Toast.makeText(getApplicationContext(), "0으로 나누면 안됩니다.", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        calc_result = num1 / num2;
                        break;
                    case R.id.btn_Mod :
                        calc_result = num1 % num2;
                        break;
                }
                txtview_result.setText("Result : " + String.valueOf(calc_result));
            }
        };
        btn_plus.setOnClickListener(ClickListen);
        btn_minus.setOnClickListener(ClickListen);
        btn_multiply.setOnClickListener(ClickListen);
        btn_divide.setOnClickListener(ClickListen);
        btn_mod.setOnClickListener(ClickListen);
    }
}
