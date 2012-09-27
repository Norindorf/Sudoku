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
}
