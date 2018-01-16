package com.twu.biblioteca;

public class Movie extends Item {

    private String director;
    private int rating;
    private String year;
    public Movie(String title, String director, int rating, String year, boolean checkedOut) {
        this.title = title;
        this.director = director;
        this.rating = rating;
        this.year = year;
        this.checkedOut = checkedOut;

    }

    public String getDirector() {
        return director;
    }

    public String getYear() {
        return year;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        return title+", "+director+", "+year+", "+rating;
    }
}
