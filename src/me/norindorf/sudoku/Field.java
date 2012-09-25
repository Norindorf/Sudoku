package me.norindorf.sudoku;

import java.util.HashSet;
import java.util.Set;

public class Field {
//    RandomFieldFiller field = new RandomFieldFiller();
//    int[][] gameField = field.randomField();
    /**
     * Забирает значение в ячейке
     * @param x
     * @param y
     * @throws IndexOutOfBoundsException если координаты вылазят за поле
     */
    public int getValue( int x, int y ) throws IndexOutOfBoundsException {
        //TODO
        return 0;
    }

    /**
     * Устанавливает значение в ячейке
     * @param x
     * @param y
     * @param value
     * @throws IndexOutOfBoundsException если координаты вылазят за поле
     * @throws IllegalArgumentException если значение не приемлимо (0>val || 9<val)
     *
     */
    public void setValue( int x, int y, int value ) throws IndexOutOfBoundsException, IllegalArgumentException {
        //TODO
    }

    /**
     * Забирает список заметок, сделанных пользователем
     * @param x
     * @param y
     * @return список заметок на ячейке
     * @throws IndexOutOfBoundsException если координаты вылазят за поле
     */
    public Set<Integer> getHints( int x, int y ) throws IndexOutOfBoundsException {
        //TODO
        return new HashSet<Integer>();
    }


    /**
     * Устанавливает список заметок, сделанных пользователем
     * @param x
     * @param y
     * @param hints список заметок о поле (набор цифр от 1 до 9)
     * @throws IndexOutOfBoundsException если координаты вылазят за поле
     * @throws IllegalArgumentException если значение не приемлимо (0>val || 9<val)
     */
    public void setHints( int x, int y, Set<Integer> hints ) throws IndexOutOfBoundsException, IllegalArgumentException {
        //TODO
    }

    /**
     * Добавляет одну заметку в ячейку
     * @param x
     * @param y
     * @param hint
     * @throws IndexOutOfBoundsException
     * @throws IllegalArgumentException
     */
    public void addHint( int x, int y, int hint ) throws IndexOutOfBoundsException, IllegalArgumentException {
        //TODO
    }

    /**
     * Убирает одну заметку из ячейки
     * @param x
     * @param y
     * @param hint
     * @throws IndexOutOfBoundsException
     * @throws IllegalArgumentException
     */
    public void removeHint( int x, int y, int hint ) throws IndexOutOfBoundsException, IllegalArgumentException {
        //TODO
    }

    /**
     * Проверяет, нет ли ошибок на поле
     * @return true если ошибок нет
     */
    public boolean checkValid(){
        //TODO
        return false;
    }

    /**
     * Проверяет, решено ли поле
     * @return true  если решено
     */
    public boolean checkSolved(){
        //TODO
        return false;
    }
}