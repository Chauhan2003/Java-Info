public class TwoPointerApproach {
    public static void main(String[] args) {
        // Technique: Keep two indices (left & right) to scan an array.
        // Works best on sorted arrays or continuous subarrays.
        // Reduces nested loops → O(n²) → O(n).

        int[] arr = {1, 2, 3, 4, 6};
        int k = 6;
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == k) {
                System.out.println(arr[l] + " + " + arr[r]);
                l++;
                r--;
            } else if (sum < k) {
                l++;
            } else {
                r--;
            }
        }
    }
}
