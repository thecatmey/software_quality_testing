package ro.ase.csie.cts.course4.singleton;

public class DbConnection {

    private static DbConnection theConnection = null;

    String servername;
    String userAcc;
    String pass;

    //Class static constructor
    //executed only once
    static{
        System.out.println("Initialising the unique connection");
        theConnection = new DbConnection("10.1.1.10");
    }

    private DbConnection(String servername){

        this.servername = servername;
        System.out.println("Creating connection to "+servername);

    }

    public static DbConnection getConnection(){
        return theConnection;
    }

    private DbConnection(String servername, String userAcc, String pass){
        this.servername = servername;
        this.userAcc = userAcc;
        this.pass = pass;
    }

    public void connect() {
        System.out.println("Connecting to " + this.servername+"...");
    }

    public void disconnect(){
        System.out.println("Disconnecting...");
    }

    public void sendSQLDemand(){
        System.out.println("Sending demand...");
    }
}
