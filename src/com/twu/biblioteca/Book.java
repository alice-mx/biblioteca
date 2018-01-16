package com.twu.biblioteca;

public class Book extends Item
{
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn, String year, boolean checkedOut) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.checkedOut = checkedOut;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getAuthor() {
        return this.author;
    }


    public String toString() {
        return title + ", " +author+", "+year+", "+isbn;
    }


}
