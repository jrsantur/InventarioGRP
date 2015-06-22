package com.app.gobiernoregional.model.local;

import com.app.gobiernoregional.model.entities.Responsable;

/**
 * Created by Junior on 20/06/2015.
 */
public interface DatabaseApi {

    Responsable getAllResponsables();

    Responsable getResponsableById();

    Responsable getOneResponsable();


}
