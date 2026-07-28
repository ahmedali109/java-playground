package SOLID;

// Jst For Demo
public class DependencyInversionPrinciple {
    public DependencyInversionPrinciple(){
        Database db = new MySQLDatabase();
        new UserService(db).saveToDataBase();

        Database db2 = new PostgreSQLDatabase();
        new UserService(db2).saveToDataBase();
    }
}

// DIP
interface Database{
    void save();
}

class MySQLDatabase implements Database{
    @Override
    public void save(){
        IO.println("Saving Using MySQLDatabase....");
    }
}

class PostgreSQLDatabase implements Database{
    @Override
    public void save() {
        IO.println("Saving Using PostgreSQLDatabase...");
    }
}

class UserService {
    private Database database;

    public UserService(Database database){
        this.database = database;
    }

    public void saveToDataBase(){
        database.save();
    }
}