package com.programmingsharing.demoreadwriterouting.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import com.programmingsharing.demoreadwriterouting.constant.DatabaseType;

@Component
public class MasterSlaveRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return TransactionSynchronizationManager.isCurrentTransactionReadOnly()? DatabaseType.READONLY_DATABASE : DatabaseType.READWRITE_DATABASE;
    }
}
