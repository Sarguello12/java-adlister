import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
    // Test of java database connectivity
    // we will need a connection object, a statement object, and a resultSet object

    private static List<String> getAuthorNames() throws SQLException {
        Config config = new Config();
        // get the driver
        List<String> authorNames = new ArrayList<>();
        // create the connection object
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
        // create the statement object
        Statement statement = connection.createStatement();
        // execute statement and get results
        ResultSet resultSet = statement.executeQuery("SELECT author_name FROM codeup_test_db.authors");
        // loops through results and inserts into list
        while (resultSet.next()){
            authorNames.add(resultSet.getString("author_name"));
        }
        return authorNames;
    }

    public static void main(String[] args) throws SQLException {
        List<String> authorNames = getAuthorNames();
        for (String name : authorNames){
            System.out.println(name);
        }
    }
}
