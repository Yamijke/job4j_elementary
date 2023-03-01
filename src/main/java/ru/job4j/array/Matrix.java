package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] myArray = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                myArray[i - 1][j - 1] = (i) * (j);
            }
        }
        return myArray;
    }
}
