package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CodeWritingTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }
    @Test
    public void testSolution1() {
        CodeWriting codeWriting = new CodeWriting();
        int n = 1;
        int expected = 1;
        int actual = codeWriting.solution(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        CodeWriting codeWriting = new CodeWriting();
        int n = 2;
        int expected = 5;
        int actual = codeWriting.solution(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution3() {
        CodeWriting codeWriting = new CodeWriting();
        int n = 3;
        int expected = 13;
        int actual = codeWriting.solution(n);
        assertEquals(expected, actual);
    }
}