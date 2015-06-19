package com.app.gobiernoregional.domain;

import com.app.gobiernoregional.model.entities.BienActivoWrapper;

/**
 * Created by practicanteoti on 15/06/2015.
 */
public interface GetDataSigaUsecase extends UseCase {


    public void requestData();

    public void sendDataToPresenter ( BienActivoWrapper response);

    public void unRegister ();
}
