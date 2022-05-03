import java.util.List;

public interface Quotes {
    List<Quote> all();
    Author getAuthorById(long id);
    void insert(Quote quote);
}
