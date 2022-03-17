package com.sectio7projects;

public class BookDemo {
    public static void main(String[] args) {

        Book book1 = new Book("book1","title1","genre1",500);
        Book book2 = new Book("book2","title2","genre2",900);
        Book book3 = new Book("book3","title3","genre3",300);

        book1.printBookDetails();
        book2.printBookDetails();
        book3.printBookDetails();


    }



}
