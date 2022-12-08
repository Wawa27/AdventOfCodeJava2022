package com.wawa.adventofcode.caloriecounting;

import com.wawa.adventofcode.shared.InputHandler;

import java.util.ArrayList;

/**
 *
 */
public class CalorieCountingInputHandler implements InputHandler {
    private final ArrayList<Elf> elves;

    public CalorieCountingInputHandler() {
        elves = new ArrayList<>();
        elves.add(new Elf());
    }

    /**
     * Add calorie to the elf
     *
     * @param input The calorie count to add
     */
    public void handleLine(String input) {
        elves.get(elves.size() - 1).addCalorie(Integer.parseInt(input));
    }

    /**
     * Create a new elf
     */
    public void handleEmptyLine() {
        elves.add(new Elf());
    }

    public ArrayList<Elf> getElves() {
        return elves;
    }
}
