package com.example.tosterlibrary;

import android.content.Context;
import android.widget.Toast;

public class TosterMessege {
    public static void s(Context c, String message){

        Toast.makeText(c,"Srilanka"+message,Toast.LENGTH_SHORT).show();

    }
}
