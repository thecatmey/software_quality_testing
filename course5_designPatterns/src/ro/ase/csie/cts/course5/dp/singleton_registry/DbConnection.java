package ro.ase.csie.cts.course5.dp.singleton_registry;
import java.util.HashMap;

public class DbConnection {

    String socket;
    String schema;

    // not the best solution but better than forgetting to initialise it
    private static HashMap<String,DbConnection> connections = new HashMap<>();

    private DbConnection(String socket, String schema){
        this.socket = socket;
        this.schema = schema;
    }

    public static DbConnection getConnection(String socket, String schema){
        // we use the socket as key
        DbConnection connection = connections.get(socket);
        if (connection == null){
            connection = new DbConnection(socket, schema);
            connections.put(socket, connection);
        }
        return connection;
    }
}
