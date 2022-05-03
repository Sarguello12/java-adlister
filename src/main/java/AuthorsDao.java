import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorsDao implements Authors{
    private Connection connection;

    public AuthorsDao() {
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
    public List<Author> all() {
        List<Author> authors = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM codeup_test_db.authors");
            while (resultSet.next()){
                Author author = new Author(
                        resultSet.getLong("id"),
                        resultSet.getString("author_name")
                );
                authors.add(author);
            }

        } catch (SQLException sqle){
            throw new RuntimeException("error connecting to db", sqle);
        }

        return authors;
    }

    @Override
    public Author getAuthorByID(long id) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM codeup_test_db.authors WHERE id=" + id );
            resultSet.next();
            Author author = new Author(
                    resultSet.getLong("id"),
                    resultSet.getString("author_name")
            );
            return author;
        } catch (SQLException sqle) {
            throw new RuntimeException("error connecting to db", sqle);
        }
    }

    @Override
    public long insert(Author author){
        String author_name = author.getAuthor_name();
        String query = "INSERT INTO codeup_test_db.authors (author_name) VALUES ('" + author_name + "')";
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
