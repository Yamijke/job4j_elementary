package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i <= array.length / 2 - 1; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int[] rsl = back(nums);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}

