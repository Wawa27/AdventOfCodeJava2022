package com.wawa.adventofcode.caloriecounting;

public class NoElvesFoundException extends Exception {
    public NoElvesFoundException() {
        super("No elves found, please check your input file");
    }
}
