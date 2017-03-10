package com.example.delli.myrealcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int number01=0;
    int number02=0;
    int textnumber=0;
    int sym=1;
    int bt=0;
    TextView textnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textnum=(TextView) findViewById(R.id.tv_num);

    }

    public void ocl_num1(View v){
        number02=number02*10+1;
        textnumber=number02;
        textnum.setText(String.valueOf(textnumber));
    }

    public void ocl_num2(View v){
        number02=number02*10+2;
        textnumber=number02;
        textnum.setText(String.valueOf(textnumber));
    }

    public void ocl_num3(View v){
        number02=number02*10+3;
        textnumber=number02;
        textnum.setText(String.valueOf(textnumber));
    }

    public void ocl_num4(View v){
        number02=number02*10+4;
        textnumber=number02;
        textnum.setText(String.valueOf(textnumber));
    }

    public void ocl_num5(View v){
        number02=number02*10+5;
        textnumber=number02;
        textnum.setText(String.valueOf(textnumber));
    }

    public void ocl_num6(View v){
        number02=number02*10+6;
        textnumber=number02;
        textnum.setText(String.valueOf(textnumber));
    }

    public void ocl_num7(View v){
        number02=number02*10+7;
        textnumber=number02;
        textnum.setText(String.valueOf(textnumber));
    }

    public void ocl_num8(View v){
        number02=number02*10+8;
        textnumber=number02;
        textnum.setText(String.valueOf(textnumber));
    }

    public void ocl_num9(View v){
        number02=number02*10+9;
        textnumber=number02;
        textnum.setText(String.valueOf(textnumber));
    }

    public void ocl_num0(View v){
        number02=number02*10+0;
        textnumber=number02;
        textnum.setText(String.valueOf(textnumber));
    }

    public void ocl_equal(View v){
        bt=0;
        if(sym==1)
            number02=number02+number01;
        else if(sym==2)
            number02=number01-number02;
        else if(sym==3)
            number02=number01*number02;
        else if(sym==4&&number02!=0)
            number02=number01/number02;
        textnumber=number02;
        textnum.setText(String.valueOf(textnumber));
    }

    public void ocl_add(View v){
        bt=bt+1;
        sym=1;
        if(bt==1)
            number01=number02;
        number02=0;
    }

    public void ocl_sub(View v){
        bt=bt+1;
        sym=2;
        if(bt==1)
            number01=number02;
        number02=0;
    }

    public void ocl_mul(View v){
        bt=bt+1;
        sym=3;
        if(bt==1)
            number01=number02;
        number02=0;
    }

    public void ocl_div(View v){
        bt=bt+1;
        sym=4;
        if(bt==1)
            number01=number02;
        number02=0;
    }

    public void ocl_re(View v){
        number01=0;
        number02=0;
        textnumber=0;
        bt=0;
        sym=1;
        textnum.setText(String.valueOf(textnumber));
    }

}
