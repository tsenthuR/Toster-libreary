package com.example.tosterlibrary;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class TosterMessege  implements TosterName{
    String message;
    public static void s(Context c, String message){

    }


    @Override
    public void Testfunction(Context c, String name) {
        Toast.makeText(c,name+"Srilankan", Toast.LENGTH_SHORT).show();
    }


}
