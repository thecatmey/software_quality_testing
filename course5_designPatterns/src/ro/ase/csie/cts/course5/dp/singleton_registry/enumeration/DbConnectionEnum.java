package ro.ase.csie.cts.course5.dp.singleton_registry.enumeration;

// implement the singleton as enumeration
// "Singleton enum"
public enum DbConnectionEnum {
    INSTANCE("a", "b");
    //private DbConnection DB_CONNECTION = null;

    String socket;
    String schema;

    private DbConnectionEnum(String socket, String schema){
        this.socket = socket;
        this.schema = schema;
    }


    public DbConnectionEnum getDbConnection(){
        return INSTANCE;
    };

    public void setDbConnection(String socket, String schema){
        this.socket = socket;
        this.schema = schema;
    }

    /*private DbConnection(String socket, String schema){
        this.socket = socket;
        this.schema = schema;
    }

    public static void setConnection(String socket, String schema){

    }

    public DbConnection getDbConnection(String socket, String schema){
        if (DB_CONNECTION == null){
            DB_CONNECTION = new DbConnection(socket,schema);
        }
        return DB_CONNECTION;
    }*/


}
