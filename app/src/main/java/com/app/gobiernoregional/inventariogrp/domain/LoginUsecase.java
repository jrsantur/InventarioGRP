package com.app.gobiernoregional.inventariogrp.domain;

import com.app.gobiernoregional.domain.UseCase;
import com.app.gobiernoregional.inventariogrp.views.listener.OnLoginFinishedListener;

/**
 * Created by Junior on 18/06/2015.
 */
public interface LoginUsecase extends UseCase {

    void login(final String username, final  String password , final OnLoginFinishedListener listener);

}
