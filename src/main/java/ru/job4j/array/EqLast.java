package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        int a = left[left.length - 1];
        int b = right[right.length - 1];
        if (a != b) {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3};
        int[] right = {1, 2, 3};
        boolean result = EqLast.check(left, right);
        System.out.println(result);
    }
}
