package com.app.gobiernoregional.domain;

import com.app.gobiernoregional.model.entities.BienActivoWrapper;
import com.app.gobiernoregional.model.local.DataSources;
import com.squareup.otto.Bus;

import javax.inject.Inject;


/**
 * Created by practicanteoti on 15/06/2015.
 */
public class GetDataSigaUsecaseController implements GetDataSigaUsecase {

    private DataSources mDataSources;
    private final Bus mBus;


    @Inject
    public GetDataSigaUsecaseController(DataSources mDataSources , Bus mUiBus) {
        this.mDataSources = mDataSources;
        this.mBus = mUiBus;
        mBus.register(this);
    }





    @Override
    public void requestData() {

    }

    @Override
    public void sendDataToPresenter(BienActivoWrapper response) {
        mBus.post(response);
    }

    @Override
    public void unRegister() {
        mBus.unregister(this);
    }


    @Override
    public void execute() {
        requestData();
    }

}
