package com.example.tosterlibrary;

import android.content.Context;
import android.widget.Toast;

public class TosterMessege {
    String x;
    public static void s(Context c, String message){

        Toast.makeText(c,"Hello "+message,Toast.LENGTH_SHORT).show();

    }
}
