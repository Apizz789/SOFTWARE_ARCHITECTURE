package com.solid.book;
import java.util.List;
public class BookReader {
    public static void main(String[] args) {
        Interface_Book_ToScreen book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}