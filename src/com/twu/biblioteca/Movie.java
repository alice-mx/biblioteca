package com.twu.biblioteca;

public class Movie extends Item {

    private String director;
    private int rating;
    private String year;
    public Movie(String title, String director, int rating, String year) {
        this.title = title;
        this.director = director;
        this.rating = rating;
        this.year = year;
        this.checkedOutTo = null;

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
        String id = (checkedOutTo == null ? "NO" : checkedOutTo.getId());
        return title+", "+director+", "+year+", "+rating+", "+id;
    }
}
