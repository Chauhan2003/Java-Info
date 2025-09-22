package sorting;

import java.util.Arrays;

// Selects the smallest element from an unsorted list.
public class SelectionSort {
    public static void swap(int[] arr, int i, int minIdx) {
        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 7, 2, 5, 1};
        int n = arr.length;

        for (int i=0;i<n;i++) {
            int minIdx = i;
            for (int j=i+1;j<n;j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }

            swap(arr, i, minIdx);
        }

        System.out.println(Arrays.toString(arr));
    }
}

// TC: O(n^2)
// SC: O(1)
