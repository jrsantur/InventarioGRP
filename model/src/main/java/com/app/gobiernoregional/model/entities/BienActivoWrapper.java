package com.app.gobiernoregional.model.entities;

import java.io.Serializable;
import java.util.List;

/**
 * Created by practicanteoti on 15/06/2015.
 */
public class BienActivoWrapper implements Serializable {

    private int id;
    private List<BienActivo> bienActivoList;

    public int getId() {
        return id;
    }

    public List<BienActivo> getBienActivoList() {
        return bienActivoList;
    }
}
