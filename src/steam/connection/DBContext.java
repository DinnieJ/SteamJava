package steam.connection;


import java.sql.Connection;
import java.sql.DriverManager;


public class DBContext {
    
    private String serverName;
    private String dbName;
    private int portNumber;
    private String userID;
    private String password;

    public DBContext() {
    }

    
    public DBContext(String serverName, String dbName, int portNumber, String userID, String password) {
        this.serverName = serverName;
        this.dbName = dbName;
        this.portNumber = portNumber;
        this.userID = userID;
        this.password = password;
    }
    
    
    public Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
    

    
}