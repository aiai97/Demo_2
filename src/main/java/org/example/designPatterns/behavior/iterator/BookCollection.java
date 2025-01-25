package org.example.designPatterns.behavior.iterator;

import java.util.ArrayList;

public class BookCollection {
    private ArrayList<Book> books = new ArrayList<>();
    void addBook(Book book){
        books.add(book);
    }

    int size(){
        return books.size();
    }

    Book getBook(int index){
        return books.get(index);
    }

    Iterator createIterator(){
        return new BookIterator(this);
    }

    private class BookIterator implements Iterator{
        private BookCollection collection;
        private int currentIndex = 0;

        public BookIterator(BookCollection books) {
            this.collection = books;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < books.size();
        }

        @Override
        public Book next() {
            return hasNext() ? collection.getBook(currentIndex++):null;
        }
    }
}
