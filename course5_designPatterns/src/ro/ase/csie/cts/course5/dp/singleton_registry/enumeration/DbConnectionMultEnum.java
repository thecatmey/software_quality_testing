package ro.ase.csie.cts.course5.dp.singleton_registry.enumeration;

import ro.ase.csie.cts.course5.dp.singleton_registry.DbConnection;

import java.util.HashMap;

// implement the singleton as enumeration
// "Singleton enum"
public enum DbConnectionMultEnum {
    INSTANCE("a", "b");
    //private DbConnection DB_CONNECTION = null;

    String socket;
    String schema;

    private static HashMap<String, DbConnectionMultEnum> connections = new HashMap<>();

    private DbConnectionMultEnum(String socket, String schema){
        this.socket = socket;
        this.schema = schema;

        connections.put(socket, this);
    }


    public DbConnectionMultEnum getDbConnection(){
        return INSTANCE;
    };

    public void setDbConnection(String socket, String schema){
        this.socket = socket;
        this.schema = schema;
    }



}
