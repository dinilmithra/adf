package com.dm.adf.common.baseapp.basemodel.framework.extension.am.prg;

import oracle.jbo.common.ampool.ApplicationPoolImpl;

public class NoDatabaseApplicationPoolImpl extends ApplicationPoolImpl {

    @SuppressWarnings("compatibility:-4706059118297046069")
    private static final long serialVersionUID = 1L;

    public NoDatabaseApplicationPoolImpl() {
        super();
    }

    @Override
    public boolean isSupportsPassivation() {
        return false;
    }
}
