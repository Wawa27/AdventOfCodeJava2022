package com.wawa.adventofcode.shared;

/**
 * Interface for handling input lines.
 */
public interface InputHandler {

    /**
     * Called when a line is read from the input file.
     * The line will not be empty.
     * @param input A non-empty line from the input file
     */
    void handleLine(String input);

    /**
     * Called when an empty line is read from the input file.
     */
    void handleEmptyLine();
}
