package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 1, 5, 4};
        int[] result = SortSelected.sort(data);
        for (int i : result) {
            System.out.println(i + " ");
        }

    }
}
