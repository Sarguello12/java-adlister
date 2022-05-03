import java.util.List;

public interface Authors {
    List<Author> all();

    Author getAuthorByID(long id);

    void insert(Author author);
}
