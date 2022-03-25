package creational;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray books;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        books = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject book = new JSONObject();
        book.put("ISBN", b.getISBN());
        book.put("Title", b.getTitle());
        book.put("Publisher", b.getPublisher());
        String[] authors = b.getAuthors();
        JSONArray authorsArray = new JSONArray();
        for (int i = 0; i < authors.length; i++) {
            authorsArray.add(authors[i]);
        }
        book.put("Authors", authorsArray);
        books.add(book);
        return this;
    }

    @Override
    public String getMetadataString() {
        return books.toJSONString();
    }
}