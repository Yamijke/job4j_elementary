package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        boolean isEven = LogicNot.isEven(4);
        System.out.println(isEven);
        boolean isPositive = LogicNot.isPositive(-1);
        System.out.println(isPositive);
        boolean notEven = LogicNot.notEven(3);
        System.out.println(notEven);
        boolean notPositive = LogicNot.notPositive(3);
        System.out.println(notPositive);
        boolean notEvenAndPositive = LogicNot.notEvenAndPositive(9);
        System.out.println(notEvenAndPositive);
        boolean evenOrNotPositive = LogicNot.evenOrNotPositive(9);
        System.out.println(evenOrNotPositive);
    }
}
