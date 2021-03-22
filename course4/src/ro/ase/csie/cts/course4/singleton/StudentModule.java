package ro.ase.csie.cts.course4.singleton;

public class StudentModule {

    DbConnection dbConnection;

    public StudentModule(){
        //DbConnection dbConnection = new DbConnection("localhost");
        this.dbConnection = DbConnection.getConnection();
    }
}
