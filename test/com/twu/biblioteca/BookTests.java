package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BookTests {

    @Test
    public void checkOutReturnedBook() {
        Book b = new Book("Barry Totter", "M.K. Bowling", "1234567890123", "2012", false);
        assertEquals(true, b.checkOut());
    }


    @Test
    public void checkOutCheckedOutBook() {
        Book b;
        b = new Book("Barry Totter", "M.K. Bowling", "1234567890123", "2012", true);
        assertFalse(b.checkOut());
    }

    @Test
    public void returnCheckedOutBook() {
        Book b = new Book("Barry Totter", "M.K. Bowling", "1234567890123", "2012", true);
        assertEquals(true, b.checkIn());
    }

    @Test
    public void returnReturnedBook() {
        Book b = new Book("Barry Totter", "M.K. Bowling", "1234567890123", "2012", false);
        assertEquals(false, b.checkIn());
    }


    @Test
    public void canCheckOut() {
        Book b = new Book("Barry Totter", "M.K. Bowling", "1234567890123", "2012", false);
        b.checkOut();
        assertEquals(true, b.getCheckedOut());
    }

    @Test
    public void canReturn() {
        Book b = new Book("Barry Totter", "M.K. Bowling", "1234567890123", "2012", true);
        b.checkIn();
        assertEquals(false, b.getCheckedOut());
    }
}
