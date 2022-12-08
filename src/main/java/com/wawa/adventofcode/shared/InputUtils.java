package com.wawa.adventofcode.shared;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Utility methods for reading advent of code input files.
 */
public class InputUtils {

    /**
     * Read the input file and pass each line to the input handler.
     * @param inputHandler The input handler to use
     * @param fileName The name of the input file
     */
    public static void readFile(InputHandler inputHandler, String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                inputHandler.handleEmptyLine();
            } else {
                inputHandler.handleLine(line);
            }
        }
    }
}
