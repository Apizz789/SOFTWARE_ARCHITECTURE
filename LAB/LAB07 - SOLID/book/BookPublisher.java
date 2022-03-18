package com.solid.book;
import java.util.List;
public class BookPublisher {
    public static void main(String[] args) {
        Interface_Book_ToFile book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
    }
}
