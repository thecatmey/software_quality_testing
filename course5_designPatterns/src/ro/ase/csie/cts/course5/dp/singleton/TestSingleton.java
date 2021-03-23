package ro.ase.csie.cts.course5.dp.singleton;

public class TestSingleton {

    // you should only go for one approach (with or without arguments)
    // the dbConnections are the same in both case so it is confusing to have both cases
    public static void main (String args[]){
        System.out.println("The app started.");

        DbConnection con1 = DbConnection.getDbConnection();
        DbConnection con2 = DbConnection.getDbConnection();
        DbConnection con3 = DbConnection.getDbConnection();

        if (con1 == con2){
            System.out.println("They are referencing the same object");
        }

        DbConnection con4 = DbConnection.getDbConnection("10.0.0.1:3306", "ctsDB");

        if (con1 == con2){
            System.out.println("They are referencing the same object");
        }

        // you still get the initial connection
        DbConnection con5 = DbConnection.getDbConnection("10.0.0.2:3306", "ctsDB");
    }
}
