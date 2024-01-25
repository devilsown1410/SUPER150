package Lec8;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 3};
        for (int i = 1; i < arr.length; i++) {
            sort(arr,i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int n) {
        int j = n - 1;
        int item = arr[n];
        while (j >= 0 && arr[j] > item) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = item;
    }
}
