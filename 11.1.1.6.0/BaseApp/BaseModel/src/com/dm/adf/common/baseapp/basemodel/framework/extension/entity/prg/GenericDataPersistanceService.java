package com.dm.adf.common.baseapp.basemodel.framework.extension.entity.prg;

import com.dm.adf.common.baseapp.basemodel.framework.extension.view.prg.GenericRowData;
import com.dm.adf.common.baseapp.basemodel.framework.extension.view.prg.TransactionContext;

/**
 * The generic data manipulation contracts are specifed here.
 * This correesponds to the operations done at EntityObject level
 * All the  methods are self explanatory. so no more comments :)
 */
public interface GenericDataPersistanceService {

    public void deleteObject(GenericRowData data);

    public void updateObject(GenericRowData data);

    public void createObject(GenericRowData data);

    public void lock(GenericRowData data);

    public void afterCommit(TransactionContext tx);

    public void beforeCommit(TransactionContext tx);

    public void beforeRollback(TransactionContext tx);

    public void afterRollback(TransactionContext tx);

    public void validate(GenericRowData data);

    public void doSelectRowNLock(GenericRowData data, boolean lock);
}
