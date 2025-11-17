// Problem:

// Given an array nums[] and an integer k, rotate the array to the right by k positions.
// Elements shifted out from the end should appear at the beginning.

// Approach (Reverse Algorithm):

// Reduce k using k = k % n to avoid extra rotations.

// Reverse the entire array.

// Reverse the first k elements.

// Reverse the remaining n - k elements.
// This produces the rotated array in optimal time.

// Time Complexity: O(n)

// (Each element is swapped a constant number of times.)

// Space Complexity: O(1)

// (In-place rotation using only temp variables.)



class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    private void reverse(int[] nums ,int start , int end){
        while(start<end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
        }
    }
}
