package com.app.gobiernoregional.inventariogrp.custom_view;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.app.gobiernoregional.inventariogrp.R;


/**
 * Created by practicanteoti on 15/06/2015.
 */
public class YesNoDialogFragment extends DialogFragment {

    Button yes;
    Button no;
    LayoutInflater mLayoutInflater;
    View rootView ;
    String title;

    public void setTitle(String title) {
        this.title = title;
    }

    YesNoDialogFragment newInstance(){
        YesNoDialogFragment yes_no_fragment = new YesNoDialogFragment();

        return yes_no_fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        return new AlertDialog.Builder(getActivity())

                .setTitle(title)
                .setPositiveButton("Si",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                               //(getActivity()).doPositiveClick();
                            }
                        }
                )
                .setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                //(getActivity()).doNegativeClick();
                            }
                        }
                )
                .create();
    }




}
