package com.twu.biblioteca;
import java.util.ArrayList;

public class Library {


    private Book[] books;
    private User[] users;
    private Movie[] movies;

    public Library(Book[] books, Movie[] movies, User[] users) {
        this.books = books;
        this.movies = movies;
        this.users = users;
    }

    public User findUser(String id) {
        for(User user : users) {
            if(user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public Item[] getCheckedInItems(Item[] items) {
        ArrayList<Item> cos = new ArrayList();
        for(Item item : items) {
            if (!item.getCheckedOut()) {
                cos.add(item);
            }
        }
        Item[] b = new Item[cos.size()];
        return cos.toArray(b);
    }

    public String printAllBooks() {
        String list = "TITLE, AUTHOR, ISBN, YEAR, CHECKED OUT\n";

        for (Item book : books) {
            list = list + book + "\n";
        }

        return list;

    }

    public String printAllMovies() {
        String list = "TITLE, DIRECTOR, YEAR, STARS, CHECKED OUT\n";

        for (Item movie : movies) {
            list = list + movie + "\n";
        }

        return list;

    }
    public String printBooks() {
        String list = "TITLE, AUTHOR, ISBN, YEAR, CHECKED OUT\n";

        for (Item book : getCheckedInItems(books)) {
            list = list + book + "\n";
        }

        return list;
    }

    public String printMovies() {
        String list = "TITLE, DIRECTOR, YEAR, STARS, CHECKED OUT\n";
        for (Item movie : getCheckedInItems(movies)) {
            list = list + movie + "\n";
        }
        return list;
    }




    public Book findBook(String title) {
        for(Book book : books) {
            if(book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public Movie findMovie(String title) {
        for(Movie movie : movies) {
            if(movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return null;
    }

    public String printChars(int n, char character) {
        String spaces = "";
        for(int i  = 0; i < n; i++) {
            spaces = spaces + character;
        }
        return spaces;
    }

}
