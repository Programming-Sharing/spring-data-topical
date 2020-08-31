package com.programmingsharing.demoreadwriterouting.context;

public class DatabaseContextHolder {

    private static final ThreadLocal<DatabaseEnvironment> CONTEXT = new ThreadLocal<>();

    public static void set(DatabaseEnvironment databaseEnvironment) {
        CONTEXT.set(databaseEnvironment);
    }

    public static DatabaseEnvironment getEnvironment() {
        return CONTEXT.get();
    }

    public static void reset() {
        CONTEXT.set(DatabaseEnvironment.UPDATABLE);
    }

}

