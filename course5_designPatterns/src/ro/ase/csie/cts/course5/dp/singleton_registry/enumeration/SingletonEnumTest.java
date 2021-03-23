package ro.ase.csie.cts.course5.dp.singleton_registry.enumeration;

public class SingletonEnumTest {

    public static void main(String[] args){
        //DbConnection.INSTANCE.setDbConnection("1001.01.01.01", "localHost");
        DbConnectionEnum con1 = DbConnectionEnum.INSTANCE.getDbConnection();
        System.out.println(con1.socket + con1.schema);

        DbConnectionEnum.INSTANCE.setDbConnection("1001.01.01.01", "localHost");
        DbConnectionEnum con2 = DbConnectionEnum.INSTANCE.getDbConnection();

        if(con1 == con2){
            System.out.println("They are the same");
        }

        System.out.println(con1.socket + con1.schema);
        System.out.println(con2.socket + con2.schema);

    }
}
