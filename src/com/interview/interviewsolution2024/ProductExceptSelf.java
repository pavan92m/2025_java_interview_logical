package com.interview.interviewsolution2024;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Initialize prefix product
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefix; // Store prefix product so far
            prefix *= nums[i];
        }
        System.out.println("After prefix : "+ Arrays.toString(answer));// [1, 1, 2, 6]
        //{1, 2, 3, 4}
        // Step 2: Compute suffix product and update answer array
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix; // Combine with the suffix product
            suffix *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums))); // Output: [24, 12, 8, 6]
    }
}

