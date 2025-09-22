package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 5, 9, 4};
        int n = arr.length;
        int k = 9;

        for (int i=0;i<n;i++) {
            if (arr[i] == k) {
                System.out.println("K is present at index = " + i);
                break;
            }
        }
    }
}

// TC: O(n)
// SC: O(1)
