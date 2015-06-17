package com.app.gobiernoregional.model.local;

import com.app.gobiernoregional.model.MediaDataSource;
import com.squareup.otto.Bus;

/**
 * Created by practicanteoti on 16/06/2015.
 */
public class DataSources implements MediaDataSource {

    DatabaseApi api;
    private final Bus bus;

    public DataSources(Bus bus) {
        this.bus = bus;
    }

    @Override
    public void getResponsables() {
        api.getResponsables();
    }
}
