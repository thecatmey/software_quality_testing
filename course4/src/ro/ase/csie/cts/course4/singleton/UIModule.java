package ro.ase.csie.cts.course4.singleton;

public class UIModule {

    DbConnection dbConnection;

    public UIModule(){
        //DbConnection dbConnection = new DbConnection("localhost");
        this.dbConnection = DbConnection.getConnection();
    }
}
