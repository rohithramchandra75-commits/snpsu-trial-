package assignments3;

import java.util.HashMap;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            if (prefixSum == k) {
                maxLength = i + 1;
            }

            if (map.containsKey(prefixSum - k)) {
                int length = i - map.get(prefixSum - k);
                maxLength = Math.max(maxLength, length);
            }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;

        int result = longestSubarray(arr, k);

        System.out.println("Longest subarray length = " + result);
    }
}