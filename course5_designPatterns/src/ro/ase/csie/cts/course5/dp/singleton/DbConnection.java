package ro.ase.csie.cts.course5.dp.singleton;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class DbConnection {
    String socket;
    String schema;

    // version 1 - eager approach (create the Singleton once the class is initiated
    // private static DbConnection dbConnection = new DbConnection();

    // lazy approach - here you do not create the object yet
    private static DbConnection dbConnection = null;

    //class static initialiser
    // there is eager loading and lazy loading --> lazy loading here. It is only loaded once the class is actually used
    // uses the class lazy-loading approach
    static{
        // block only executed once, when the class is loaded by the JVM
        System.out.println("Loading database connection string");
    }

    // constructor initialiser
    {
        // executed before each constructor call
        System.out.println("Init connection string");
    }


    private DbConnection (){
        System.out.println("Creating a DB connection");
        // access a local settings file to get credentials and conn string
    }

    private DbConnection(String socket, String schema){
        this.socket = socket;
        this.schema = schema;
    }

    // the method used to return the reference to the unique object
    // is using default/ app settings value
    // works for both lazy and eager approach (if-clause works for lazy approach)
    // Normally lazy has more advantages over eager
    public static DbConnection getDbConnection(){
        if (DbConnection.dbConnection == null){
            // here you can get details from files, etc.
            dbConnection = new DbConnection();
        }
        return DbConnection.dbConnection;
    }

    public static DbConnection getDbConnection(String socket, String schema){
        if (DbConnection.dbConnection == null){
            dbConnection = new DbConnection(socket, schema);
        }
        // optional = throw an error when they are trying to open a connection to another database
        if(!socket.equals(dbConnection.socket) || !schema.equals(dbConnection.schema)){
            throw new UnsupportedOperationException("You already have an opened connection");
        }

        return DbConnection.dbConnection;
    }
}
