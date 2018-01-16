package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AppTests {

    @Test
    public void checkInput() {
        assertTrue(BibliotecaApp.isValid("list book"));
        assertTrue(BibliotecaApp.isValid("list movie"));

        assertTrue(BibliotecaApp.isValid("checkout book"));
        assertTrue(BibliotecaApp.isValid("checkout movie"));


        assertTrue(BibliotecaApp.isValid("return movie"));
        assertTrue(BibliotecaApp.isValid("return book"));


        assertFalse(BibliotecaApp.isValid("wrong input"));
        assertFalse(BibliotecaApp.isValid("return wronginput"));
        assertFalse(BibliotecaApp.isValid("list wrong"));
        assertFalse(BibliotecaApp.isValid("checkout wrong"));
        assertFalse(BibliotecaApp.isValid("oneword"));
        assertFalse(BibliotecaApp.isValid("one two three"));

    }
}
