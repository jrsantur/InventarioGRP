package com.app.gobiernoregional.inventariogrp.mvp.views;

/**
 * Created by practicanteoti on 11/06/2015.
 */
public interface DownloadDataView extends View{


    void startProgressBar ();
    void stopProgressBar();
    void finishDownload();
    void startDownload();
    void hideButtonCancell();
    void showButtonCancel();
    void showMessage();
    void showDialog();
    boolean isTheDatatEmpty ();

}
