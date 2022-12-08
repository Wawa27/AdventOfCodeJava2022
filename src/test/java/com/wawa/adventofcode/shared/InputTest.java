package com.wawa.adventofcode.shared;

import com.wawa.adventofcode.caloriecounting.CalorieCounting;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.IOException;
import java.util.Objects;

public class InputTest extends TestCase implements InputHandler {
    private int totalEmptyLines;
    private int totalLines;

    public InputTest(String testName) {
        super(testName);
        this.totalEmptyLines = 0;
        this.totalLines = 0;
    }

    public static Test suite() {
        return new TestSuite(InputTest.class);
    }

    public void testInput() throws IOException {
        String filePath = Objects.requireNonNull(InputTest.class.getClassLoader().getResource("test.input")).getFile();
        InputUtils.readFile(this, filePath);
        assertEquals(10, totalEmptyLines);
        assertEquals(7, totalLines);
    }

    @Override
    public void handleLine(String input) {
        this.totalLines++;
    }

    @Override
    public void handleEmptyLine() {
        this.totalEmptyLines++;
    }
}
