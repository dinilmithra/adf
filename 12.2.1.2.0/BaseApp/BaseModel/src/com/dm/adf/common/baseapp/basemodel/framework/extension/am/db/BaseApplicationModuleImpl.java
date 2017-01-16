package com.dm.adf.common.baseapp.basemodel.framework.extension.am.db;

import oracle.jbo.server.ApplicationModuleImpl;

public class BaseApplicationModuleImpl extends ApplicationModuleImpl {
    public BaseApplicationModuleImpl() {
        super();
    }

    @Override
    protected void create() {
        System.out.println("Inside create");
        super.create();
    }
}
