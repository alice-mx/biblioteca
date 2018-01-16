package com.twu.biblioteca;

public class Book extends Item
{
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn, String yea) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.checkedOutTo = null;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getAuthor() {
        return this.author;
    }


    public String toString() {

        String id = (checkedOutTo == null ? "NO" : checkedOutTo.getId());
        return title + ", " +author+", "+year+", "+isbn+", "+id;
    }


}
