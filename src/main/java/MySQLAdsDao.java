import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM adlister_db.ads");
            while(resultSet.next()){
                Ad ad = new Ad(
                    resultSet.getInt("id"),
                    resultSet.getInt("user_id"),
                    resultSet.getString("title"),
                    resultSet.getString("description")
                );
                ads.add(ad);
            }
        } catch(SQLException sqle){
            sqle.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        long userId = ad.getUserId();
        String title = ad.getTitle();
        String description = ad.getDescription();

        String query = "INSERT INTO adlister_db.ads (user_id, title, description) VALUES ('" + userId + "','" + title + "','" + description + "')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            long key = resultSet.getLong(1);
            return key;
        } catch (SQLException sqle) {
            throw new RuntimeException("error connecting to db", sqle);
        }

    }
}
