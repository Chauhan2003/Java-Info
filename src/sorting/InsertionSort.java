package sorting;

import java.util.Arrays;

// Place an unsorted element at its suitable place in each iteration.
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 7, 2, 5, 1};
        int n = arr.length;

        for (int i=1;i<n;i++) {
            int cur = arr[i];
            int idx = i-1;

            while (idx >= 0 && cur < arr[idx]) {
                arr[idx + 1] = arr[idx];
                idx--;
            }

            arr[idx+1] = cur;
        }

        System.out.println(Arrays.toString(arr));
    }
}

// TC: O(n^2)
// SC: O(1)