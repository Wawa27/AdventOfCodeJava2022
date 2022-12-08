package com.wawa.adventofcode.caloriecounting;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.IOException;
import java.util.Objects;

public class CalorieCountingTest extends TestCase {

    public CalorieCountingTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(CalorieCountingTest.class);
    }

    public void testExample() throws IOException, NoElvesFoundException {
        String resourcePath = "caloriecounting/example.input";
        String filePath = Objects.requireNonNull(CalorieCountingTest.class.getClassLoader().getResource(resourcePath)).getFile();

        assertEquals(24000, CalorieCounting.getMostCaloriesFromElves(filePath));
    }
}
