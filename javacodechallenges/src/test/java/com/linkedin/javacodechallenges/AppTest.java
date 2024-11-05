package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
 /**    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    } */

    public void isEven_true() {
        assertTrue(App.isEven(0));
        assertTrue(App.isEven(2));
        assertTrue(App.isEven(4));
        assertTrue(App.isEven(6));
        assertTrue(App.isEven(8));
        assertTrue(App.isEven(-20));
        assertTrue(App.isEven(100));
        assertTrue(App.isEven(-46));
    }

    public void isEven_False() {
        assertFalse(App.isEven(1));
        assertFalse(App.isEven(3));
        assertFalse(App.isEven(5));
        assertFalse(App.isEven(7));
        assertFalse(App.isEven(9));
        assertFalse(App.isEven(-11));
        assertFalse(App.isEven(93));
        assertFalse(App.isEven(-75));
    }
}
