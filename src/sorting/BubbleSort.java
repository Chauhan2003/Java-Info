package sorting;

import java.util.Arrays;

// Compares two adjacent elements and swaps them.
public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 7, 2, 5, 1};
        int n = arr.length;

        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

// TC: O(n^2)
// SC: O(1)
