package com.dm.adf.common.baseapp.basemodel.framework.extension.view.db;

import java.util.Comparator;

import oracle.jbo.Row;
import oracle.jbo.RowComparator;
import oracle.jbo.server.RowFilter;
import oracle.jbo.server.ViewDefImpl;
import oracle.jbo.server.ViewObjectImpl;

public class BaseViewObjectImpl extends ViewObjectImpl {
    public BaseViewObjectImpl(String string, ViewDefImpl viewDefImpl) {
        super(string, viewDefImpl);
    }

    public BaseViewObjectImpl() {
        super();
    }

    @Override
    protected void executeQueryForCollection(Object object, Object[] object2,
                                             int i) {
        super.executeQueryForCollection(object, object2, i);
    }
}
