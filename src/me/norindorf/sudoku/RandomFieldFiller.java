package me.norindorf.sudoku;

import java.util.Random;

public class RandomFieldFiller {
    public int[][] randomField() {
        int sudokuField[][] = new int[9][9];
        int horizontal, vertical;

        for (horizontal = 0;horizontal<9;horizontal++){
            for (vertical = 0;vertical<9;vertical++){
                Random randomGenerator = new Random();
                int ranNum = randomGenerator.nextInt(9);
                sudokuField[horizontal][vertical] = ranNum ;//+ 1;
            }
        }

        return sudokuField;
    }
}
