package com.wawa.adventofcode.caloriecounting;

/**
 * Representation of an elf and its calories.
 */
public class Elf {
    private int calories;

    public Elf() {
        calories = 0;
    }

    public void addCalorie(int calorie) {
        this.calories += calorie;
    }

    public int getCalories() {
        return calories;
    }
}
