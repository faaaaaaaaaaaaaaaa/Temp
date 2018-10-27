package com.example.far.temp;

import android.app.AlertDialog;
//import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button c_to_f = findViewById(R.id.button);
        Button f_to_c = findViewById(R.id.button2);
        final TextView result = findViewById(R.id.textView);
        final EditText input_num = findViewById(R.id.editText);


        final cal ca = new cal();


        c_to_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String raw_data = input_num.getText().toString();

                    if(raw_data.isEmpty()) {
                        null_input();
                    }
                    else {
                        double input = Double.valueOf(raw_data);
                        result.setText(ca.cal_c_to_f(input));
                    }
                }
        });


        f_to_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String raw_in = input_num.getText().toString();

                if(raw_in.isEmpty()) {
                    null_input();
                }
                else {
                    double input = Double.valueOf(raw_in);
                    result.setText(ca.cal_f_to_c(input));
                }
            }
        });
    }

    public void null_input(){
//        Toast t = Toast.makeText(getApplicationContext(), "กรุณากรอกตัวเลข", Toast.LENGTH_LONG);
  //      t.show();
        new AlertDialog.Builder(MainActivity.this)
                .setMessage("กรุณากรอกตัวเลข")
                .setPositiveButton("OK", null)
                .show();
    }
}
