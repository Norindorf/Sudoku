package me.norindorf.sudoku;

public class Main {
    public static void main(String[] args) {
        RandomFieldFiller randomFieldFiller = new RandomFieldFiller();
        Field field = randomFieldFiller.randomFieldGenerator();
        System.out.println(field.toString());
    }
}
