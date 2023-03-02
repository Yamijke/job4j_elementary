package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] myArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                myArray[i][j] = (i + 1) * (j + 1);
            }
        }
        return myArray;
    }
}
