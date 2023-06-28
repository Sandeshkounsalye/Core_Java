public class DataBase {

    private static DataBase dataBase;

    private DataBase() {
    }

    public static DataBase getInstance(){
        if (dataBase==null){
            dataBase=new DataBase();
        }
        return dataBase;
    }
}
class main{
    public static void main(String[] args) {
        DataBase db=DataBase.getInstance();
        System.out.println(db.hashCode());

        DataBase db1=DataBase.getInstance();
        System.out.println(db1.hashCode());

    }
}
