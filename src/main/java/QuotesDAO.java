import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuotesDAO implements Quotes{
    public Connection connection;

    public QuotesDAO(){
        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    @Override
    public List<Quote> all() {
        List<Quote> quotes = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM codeup_test_db.quotes");
            while (resultSet.next()){
                long author_id = resultSet.getLong("author_id");
                Authors authorsDao = new AuthorsDao();
                Author quoteAuthor = authorsDao.getAuthorByID(author_id);
                Quote quote = new Quote(
                        resultSet.getLong("id"),
                        resultSet.getString("content"),
                        quoteAuthor
                );
                quotes.add(quote);
            }
        } catch (SQLException sqle){
            throw new RuntimeException("error connecting to db", sqle);
        }
        return quotes;
    }

    @Override
    public Author getAuthorById(long id) {
        return null;
    }

    @Override
    public long insert(Quote quote) {
        return 0;
    }


}
