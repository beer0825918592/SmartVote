package com.example.smartvote;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b= findViewById(R.id.button2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e= findViewById(R.id.editText2);
                if(e.getText().toString().length()!=13){

                    String message = "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก";
                    Toast t = Toast.makeText(Main2Activity.this,message, Toast.LENGTH_SHORT);
                    t.show();
                }else{
                    String s=e.getText().toString();
                    if(s.equals("1111111111111")||s.equals("2222222222222")){
                        new AlertDialog.Builder(Main2Activity.this)
                                .setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง")
                                .setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง") //  msg
                                .setPositiveButton("OK",null)

                                .setCancelable(false)
                                .show();
                    }else{
                        new AlertDialog.Builder(Main2Activity.this)
                                .setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง")
                                .setMessage("คุณไม่มีสิทธิเลือกตั้ง") //  msg
                                .setPositiveButton("OK",null)

                                .setCancelable(false)
                                .show();
                    }
                }
            }
        });
    }
}
