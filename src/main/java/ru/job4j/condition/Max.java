package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int west) {
        int tmp = max(right, west);
        return max(left, tmp);
    }

    public static int max(int left, int right, int west, int east) {
        int tmp = max(right, west, east);
        return max(left, tmp);
    }

    public static void main(String[] args) {
        int result = Max.max(1, 2, 3, 4);
        System.out.println("Maximum value " + result);
    }
}
