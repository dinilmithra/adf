package com.dm.adf.common.baseapp.basemodel.framework.extension.am.prg;

import oracle.jbo.server.DefaultTxnHandlerFactoryImpl;
import oracle.jbo.server.TransactionHandler;

public class CustomTxnHandlerFactoryImpl extends DefaultTxnHandlerFactoryImpl {
    public CustomTxnHandlerFactoryImpl() {
        super();
    }

    @Override
    public TransactionHandler createTransactionHandler() {
        return new CustomTxnHandlerImpl();
    }
}
