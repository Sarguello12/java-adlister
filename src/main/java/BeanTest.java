import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album samsAlbum = new Album();
        samsAlbum.setArtist("Sam");
        samsAlbum.setName("Sam's Album");
        samsAlbum.setReleaseDate(2022);
        samsAlbum.setSales(100000000);
        samsAlbum.setGenre("hip hop");

        Author sam = new Author();
        sam.setAuthorName("Sam");

        Quote samsQuote = new Quote();
        samsQuote.setContent("Yo Yo Yo im a dope quote");
        samsQuote.setAuthor("Sam");

        Quote secondQuote = new Quote();
        secondQuote.setContent("boring");
        secondQuote.setAuthor("dude");

        Quote thirdQuote = new Quote();
        thirdQuote.setContent("lame");
        thirdQuote.setAuthor("guy");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(samsQuote);
        quotes.add(secondQuote);
        quotes.add(thirdQuote);

        for(Quote quote : quotes){
            System.out.println(quote.getAuthor() + " said " + quote.getContent());
        }
    }
}
