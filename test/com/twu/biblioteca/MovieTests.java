package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MovieTests {

    @Test
    public void checkOutReturnedMovie() {
        Movie b = new Movie("Barry Totter", "M.K. Bowling", 2, "2012", false);
        assertEquals(true, b.checkOut());
    }


    @Test
    public void checkOutCheckedOutMovie() {
        Movie b;
        b = new Movie("Barry Totter", "M.K. Bowling", 3, "2012", true);
        assertFalse(b.checkOut());
    }

    @Test
    public void returnCheckedOutMovie() {
        Movie b = new Movie("Barry Totter", "M.K. Bowling", 4, "2012", true);
        assertEquals(true, b.checkIn());
    }

    @Test
    public void returnReturnedMovie() {
        Movie b = new Movie("Barry Totter", "M.K. Bowling",5, "2012", false);
        assertEquals(false, b.checkIn());
    }


    @Test
    public void canCheckOut() {
        Movie b = new Movie("Barry Totter", "M.K. Bowling", 3, "2012", false);
        b.checkOut();
        assertEquals(true, b.getCheckedOut());
    }

    @Test
    public void canReturn() {
        Movie b = new Movie("Barry Totter", "M.K. Bowling", 2, "2012", true);
        b.checkIn();
        assertEquals(false, b.getCheckedOut());
    }
}
