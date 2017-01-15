package com.dm.adf.common.baseapp.basemodel.framework.extension.am.prg;

import java.sql.Connection;

import oracle.jbo.server.DefaultTxnHandlerImpl;


public class CustomTxnHandlerImpl extends DefaultTxnHandlerImpl {
    @Override
    public void handleCommit(Connection conn, boolean autoStart) {
        System.out.println("###> ignoring handleCommit() <###");
    }

    @Override
    public void handleRollback(Connection conn, boolean autoStart) {
        System.out.println("###> ignoring handleRollback() <###");
    }
}
