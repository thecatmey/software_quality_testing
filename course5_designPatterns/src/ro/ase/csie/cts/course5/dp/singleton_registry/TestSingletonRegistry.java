package ro.ase.csie.cts.course5.dp.singleton_registry;

public class TestSingletonRegistry {

    public static void main(String[] args){
        DbConnection dbCon1 = DbConnection.getConnection("127.0.0.1", "localDB");
        DbConnection dbCon2 = DbConnection.getConnection("127.0.0.1", "localDB");
        DbConnection dbCon3 = DbConnection.getConnection("10.0.0.1", "prodDB");

        if (dbCon1 == dbCon2){
            System.out.println("They are the same");
        }

        if (dbCon1 != dbCon3){
            System.out.println("They are different");
        }
    }
}
