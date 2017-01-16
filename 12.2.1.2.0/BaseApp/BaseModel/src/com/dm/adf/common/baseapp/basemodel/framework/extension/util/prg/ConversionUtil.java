package com.dm.adf.common.baseapp.basemodel.framework.extension.util.prg;


import com.dm.adf.common.baseapp.basemodel.framework.extension.view.prg.GenericRowData;

import oracle.jbo.server.Entity;

/**
 * Utiltiy for converting Entity to GenericRowData
 */
public class ConversionUtil {
    public ConversionUtil() {
        super();
    }

    public static GenericRowData converEntityToRowData(Entity eo) {
        GenericRowData row = new GenericRowData();
        String[] attributes = eo.getAttributeNames();
        for (String attrib : attributes) {
            row.put(attrib, eo.getAttribute(attrib));
        }
        row.setStatus(eo.getEntityState());
        return row;
    }
}
