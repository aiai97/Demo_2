package org.example.designPatterns.behavior.iterator;

public class Solution {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("Leslie is a chat bot"));
        collection.addBook(new Book("Leslie cursed her exes again"));

        Iterator iterator = collection.createIterator();
        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.title);
        }
    }
}
