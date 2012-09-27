package me.norindorf.sudoku;

import java.util.Random;

public class RandomFieldFiller {
    public Field randomFieldGenerator() {
        Field field = new Field();

        int horizontal, vertical;

        for (horizontal = 0; horizontal < 9; horizontal++) {
            for (vertical = 0; vertical < 9; vertical++) {
                Random randomGenerator = new Random();
                int ranNum = randomGenerator.nextInt(9);
                field.setValue(horizontal, vertical, ranNum + 1);
            }
        }
        return field;
    }

    public Field getValidField(){
        Field field = new Field();
        int horizontal, vertical;

        int[][] validFieldOfValues = new int[][]{
                {1,4,7,9,3,6,8,2,5},
                {2,5,8,1,4,7,9,3,6},
                {3,6,9,2,5,8,1,4,7},
                {7,1,4,6,9,3,5,8,2},
                {8,2,5,7,1,4,6,9,3},
                {9,3,6,8,2,5,7,1,4},
                {4,7,1,3,6,9,2,5,8},
                {5,8,2,4,7,1,3,6,9},
                {6,9,3,5,8,2,4,7,1}};

        for (horizontal = 0; horizontal < 9; horizontal++) {
            for (vertical = 0; vertical < 9; vertical++) {
                int validValue = validFieldOfValues[horizontal][vertical];
                field.setValue(horizontal, vertical, validValue);
            }
        }
        return field;
    }
}
