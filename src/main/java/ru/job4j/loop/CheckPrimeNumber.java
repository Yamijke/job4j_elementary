package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number == 1) {
            return false;
        }
        boolean prime = true;
        for (int kek = 2; kek <= number - 1; kek++) {
            if (number % kek == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(CheckPrimeNumber.check(5));
    }
}
