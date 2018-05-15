package com.example.lawrence.fju_post;

import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

public class ExampleDialog extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        Log.e("Login","5");
        builder.setTitle("Information")
                .setMessage("PASSWORD ERROR")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e("Login","6");
                    }
                });
        return builder.create();
    }
}

