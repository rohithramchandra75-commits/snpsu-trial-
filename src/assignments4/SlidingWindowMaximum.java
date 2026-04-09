package Module11;

// LeetCode 239 - Sliding Window Maximum

import java.util.*;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        int index = 0;

        for(int i=0;i<nums.length;i++){

            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i >= k-1){
                result[index++] = nums[dq.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] res = maxSlidingWindow(nums,k);

        for(int x : res)
            System.out.print(x + " ");
    }
}