public class SlidingWindowApproach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,4,-10,5,6};
        int k = 3;
        // find max sum of k element?

        int resMaxSum = Integer.MIN_VALUE;

        for (int i=0; i <= arr.length - k; i++) {
            int currSum = 0;
            int j = i;
            while (j < i + k) {
                currSum += arr[j];
                j++;
            }
            resMaxSum = Math.max(resMaxSum, currSum);
        }

        System.out.println(resMaxSum);


        // Sliding window:
        // 1) with k window
        // 2) without k window

        // 1) with k window - there will be given to (find k size array\sum of k element)
        // 2) without k window - there will be given to (find max sum of subarray)

//        for {
//            while{
//
//            }
//        }


    }
}
