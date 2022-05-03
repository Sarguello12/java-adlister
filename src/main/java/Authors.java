import java.util.List;

public interface Authors {
    List<Author> all();

    Author getAuthorByID(long id);

    long insert(Author author);
}
