package com.pgy.ups.biz.business.configuration;

public class HandlerDataSource {

    public static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<DatabaseType>();

    public  enum DatabaseType {
        Master, Slave
    }

    public static void master(){
        contextHolder.set(DatabaseType.Master);
    }


    public static void slave(){
        contextHolder.set(DatabaseType.Slave);
    }

    public static void setDatabaseType(DatabaseType type) {
        contextHolder.set(type);
    }

    public static DatabaseType getType(){
        return contextHolder.get() == null ? DatabaseType.Master : contextHolder.get();
    }

    public static void clearDataSource() {
        contextHolder.remove();
    }
}
