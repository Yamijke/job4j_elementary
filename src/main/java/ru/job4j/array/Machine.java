package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        if (money < price) {
            return new int[0];
        }
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int mon = money - price;
        for (int i = 0; i < coins.length; i++) {
            if (mon > 0) {
                while (mon >= coins[i]) {
                    mon = mon - coins[i];
                    rsl[size] = coins[i];
                    size++;
                }
            } else {
                break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
