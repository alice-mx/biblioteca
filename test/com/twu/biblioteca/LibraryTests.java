package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTests {

    @Test
    public void findUser() {
        User u = new User("1234","","","");
        User[] users = new User[] {
                u,
                new User("1434","","",""),
                new User("1434","","","")
        };

        Library lib = new Library(new Book[0], new Movie[0], users);
        assertEquals(lib.findUser("1234"), u);
        assertEquals(lib.findUser("invalid id"), null);
    }

    @Test
    public void filterCheckedInBooks() {
        Book[] books = new Book[]{
                new Book("Barry Totter", "M.K. Bowling", "1234567890123", "2012"),
                new Book("Hungry Games", "A.B. Smith", "1234567890124", "2015"),
                new Book("Where the Mild Things Are", "Boris Sendlack", "1234567890125", "2014")
        };

        Library lib = new Library(books,null, null);

        assertEquals(2, lib.getCheckedInItems(books).length);

    }

    @Test
    public void findBook() {
        Book b =  new Book("Barry Totter", "M.K. Bowling", "1234567890123", "2012");
        Book[] books = new Book[]{
                b,
               new Book("Hungry Games", "A.B. Smith", "1234567890124", "2015"),
                new Book("Where the Mild Things Are", "Boris Sendlack", "1234567890125", "2014")
        };
        Library lib = new Library(books, null, null);
        assertEquals(b, lib.findBook("Barry Totter"));
    }



    @Test
    public void findMissingBook() {
        Book[] books = new Book[]{
                new Book("Barry Totter", "M.K. Bowling", "1234567890123", "2012"),
                new Book("Hungry Games", "A.B. Smith", "1234567890124", "2015"),
                new Book("Where the Mild Things Are", "Boris Sendlack", "1234567890125", "2014")
        };
        Library lib = new Library(books, null, null);
        assertEquals(null, lib.findBook("Missing Book"));
    }

}
