package me.norindorf.sudoku;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomFieldFiller field = new RandomFieldFiller();
        int[][] gameField = field.randomField();
        for (int[] ints : gameField) {
            System.out.print (Arrays.toString(ints) + " ");
            System.out.println();
        }
    }
}
