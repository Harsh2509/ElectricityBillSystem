package electricity.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class database {
    Connection connection;
    Statement statement;

    database(){
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/mydb"; // Replace 'mydb' with your database name
        String user = "root";
        String password = "rootpassword"; // Replace with your root password

        try{
            connection = DriverManager.getConnection(url, user,password);
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}
