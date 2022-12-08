package com.wawa.adventofcode.caloriecounting;

import com.wawa.adventofcode.shared.InputUtils;

import java.io.IOException;
import java.util.Comparator;
import java.util.Objects;

/**
 * Solution for the Advent of Code 2022 Day 1 puzzle.
 * Find the Elf carrying the most Calories.
 * How many total Calories is that Elf carrying?
 */
public class CalorieCounting {

    /**
     * Entry point for the solution.
     * @param args Input file with calories, if no input file is provided, use the input file provided by the puzzle.
     * @throws IOException If the input file cannot be read.
     */
    public static void main(String[] args) throws IOException {
        String filePath;
        if (args.length > 0) {
            filePath = args[0];
        } else {
            filePath = Objects.requireNonNull(CalorieCounting.class.getClassLoader().getResource("calorie_counting.input")).getFile();
        }

        System.out.println("Elf with the most Calories: " + getTop3MostCaloriesFromElves(filePath));
    }

    /**
     * Check the input file for the elf with the most Calories,
     * @param filePath The input file path.
     * @throws IOException If the input file cannot be read.
     * @return The elf with the most Calories.
     */
    public static int getMostCaloriesFromElves(String filePath) throws NoElvesFoundException, IOException {
        CalorieCountingInputHandler inputHandler = new CalorieCountingInputHandler();
        InputUtils.readFile(inputHandler, filePath);

        Elf elfWithMostCalories = inputHandler.getElves()
                .stream()
                .max(Comparator.comparingInt(Elf::getCalories))
                .orElseThrow(NoElvesFoundException::new);

        return elfWithMostCalories.getCalories();
    }

    /**
     * Check the input file for the top 3 elves with the most Calories,
     * @param filePath The input file path.
     * @throws IOException If the input file cannot be read.
     * @return The calories of the top 3 elves.
     */
    public static int getTop3MostCaloriesFromElves(String filePath) throws IOException {
        CalorieCountingInputHandler inputHandler = new CalorieCountingInputHandler();
        InputUtils.readFile(inputHandler, filePath);

        return inputHandler.getElves()
                .stream()
                .sorted(Comparator.comparingInt(Elf::getCalories).reversed())
                .limit(3)
                .mapToInt(Elf::getCalories)
                .sum();
    }
}
