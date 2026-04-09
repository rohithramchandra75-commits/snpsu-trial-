package assignments3;

public class KadaneAlgorithm {

    public static int maxSubArraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int result = maxSubArraySum(arr);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}