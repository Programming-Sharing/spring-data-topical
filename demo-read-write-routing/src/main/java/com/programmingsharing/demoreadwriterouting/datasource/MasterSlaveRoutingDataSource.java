package com.programmingsharing.demoreadwriterouting.datasource;

import com.programmingsharing.demoreadwriterouting.context.DatabaseContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MasterSlaveRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        System.out.println(getClass()+": "+ DatabaseContextHolder.getEnvironment());
        return DatabaseContextHolder.getEnvironment();
    }
}
