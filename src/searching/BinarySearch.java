package searching;

public class BinarySearch {
    public static void main(String[] args) {
        // It works only for sorted array:
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int k = 5;

        int l = 0;
        int r = n-1;

        while(l <= r) {
            int mid = l + (r-l)/2;

            if (arr[mid] == k) {
                System.out.println("K is present at index = " + mid);
                break;
            } else if (arr[mid] < k) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
    }
}

// TC: O(log(n))
// SC: O(1)
