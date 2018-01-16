package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class UserTests {

    @Test
    public void testLogin() {
        User u = new User("123-456", "1234", "bob", "email");
        assertEquals(true, u.logIn("1234"));
        assertFalse(u.logIn("NOT PASSWORD"));
    }
}
