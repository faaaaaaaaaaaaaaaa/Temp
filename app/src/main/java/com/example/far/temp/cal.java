package com.example.far.temp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class cal {

    //public int input;


    private static DecimalFormat df2 = new DecimalFormat(".##");



    public String cal_c_to_f(double input){
        return df2.format(input*1.8+32.0);
    }

    public String cal_f_to_c(double input){
        return df2.format((input-32.0)/1.8);
    }

}
