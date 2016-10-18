package com.example.l400.fragments;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

/**
 * Created by l400 on 10/15/2016.
 */
public class MydialogFragment extends DialogFragment {
    public MydialogFragment(){

    }
    Bundle b = getArguments();

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder al = new AlertDialog.Builder(getActivity());
         al.setTitle("Result");
        al.setMessage("this is result  : ");
        al.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                getDialog().dismiss();
            }
        });

        return al.create();

    }
}
