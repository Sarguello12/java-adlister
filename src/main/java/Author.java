import java.io.Serializable;

public class Author implements Serializable {
    private String authorName;

    public Author(){}

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
