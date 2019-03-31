package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class StringEndsWithTest {
    @Test
    public void testSomething() {
        assertEquals(true, StringEndsWith.solution("abc", "bc"));
        assertEquals(true, StringEndsWith.solution("samurai", "ai"));
    }
}