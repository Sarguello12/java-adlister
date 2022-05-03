import java.util.List;

public interface Quotes {
    List<Quote> all();
    Author getAuthorById(long id);
    long insert(Quote quote);
}
