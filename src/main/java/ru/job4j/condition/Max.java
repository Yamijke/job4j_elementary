package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int west) {
        return max(left, max(right, west));
    }

    public static int max(int left, int right, int west, int east) {
        return max(max(left, right), max(west, east));
    }

    public static void main(String[] args) {
        int result = Max.max(1, 2, 3, 4);
        System.out.println("Maximum value " + result);
    }
}
