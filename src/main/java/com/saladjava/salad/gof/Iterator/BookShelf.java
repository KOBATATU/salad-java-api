package com.saladjava.salad.gof.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {

    List<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public int getLength() {
        return books.size();
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
