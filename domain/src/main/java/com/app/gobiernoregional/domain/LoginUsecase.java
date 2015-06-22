package com.app.gobiernoregional.domain;

/**
 * Created by Junior on 18/06/2015.
 */
public interface LoginUsecase extends UseCase {

    void login(String username, String password);

}
