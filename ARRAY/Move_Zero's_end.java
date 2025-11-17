// Problem:

// Given an array nums[], move all zeroes to the end of the array while keeping the order of non-zero elements intact.
// Do this in-place without using extra space.

// Approach:

// Use a two-pointer technique:

// Pointer j tracks the position where the next non-zero should go.

// Traverse with i; whenever you find a non-zero element, swap it with nums[j] and increment j.
// This shifts all non-zero values forward and pushes zeroes to the end.

// Time Complexity: O(n)

// (Each element is visited once.)

// Space Complexity: O(1)

// (In-place swapping without extra memory.)



class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!= 0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
            }  
        }
    }
}
