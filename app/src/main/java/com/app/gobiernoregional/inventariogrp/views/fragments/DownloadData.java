package com.app.gobiernoregional.inventariogrp.views.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.app.gobiernoregional.inventariogrp.R;
import com.app.gobiernoregional.inventariogrp.mvp.views.DownloadDataView;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DownloadData.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DownloadData#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DownloadData extends Fragment implements DownloadDataView{


    private OnFragmentInteractionListener mListener;
    ImageView btnStartDowload ;
    ProgressBar mProgressBar;
    Button btncancelDowload;
    View rootView;


    int mProgressStatus = 0;
    Handler mHandler = new Handler();

    public static DownloadData newInstance(String param1, String param2) {
        DownloadData fragment = new DownloadData();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public DownloadData() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView =  inflater.inflate(R.layout.fragment_download_data, container, false);

        btnStartDowload = (ImageView)rootView.findViewById(R.id.btnDescarga);

        btncancelDowload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return rootView;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void startProgressBar() {
        mProgressBar = (ProgressBar)rootView.findViewById(R.id.load);
        mProgressBar.setIndeterminate(true);

        // Start lengthy operation in a background thread
        new Thread(new Runnable() {
            public void run() {
                showButtonCancel();
                while (mProgressStatus < 100) {
                    mProgressStatus++;
                    // Update the progress bar
                    mHandler.post(new Runnable() {
                        public void run() {
                            mProgressBar.setProgress(mProgressStatus);
                        }
                    });
                }
            }
        }).start();
    }

    @Override
    public void stopProgressBar() {

    }

    @Override
    public void finishDownload() {

    }

    @Override
    public void startDownload() {

    }

    @Override
    public void hideButtonCancell() {
        Button btnCancel = (Button) rootView.findViewById(R.id.actionCancel);
        btnCancel.setVisibility(View.GONE);
    }

    @Override
    public void showButtonCancel() {
        Button btnCancel = (Button) rootView.findViewById(R.id.actionCancel);
        btnCancel.setVisibility(View.VISIBLE);
    }

    @Override
    public void showMessage() {

    }

    @Override
    public void showDialog() {

        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.messageDowloadDialog)
                .setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        startProgressBar();
                        startDownload();
                        dialog.dismiss();
                        Toast.makeText(getContext(), "Se inicio la descarga de datos", Toast.LENGTH_LONG);

                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        // Create the AlertDialog object and return it
        builder.create();


    }

    @Override
    public boolean isTheDatatEmpty() {
        return false;
    }

    @Override
    public Context getContext() {
        return getActivity().getApplicationContext();
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
