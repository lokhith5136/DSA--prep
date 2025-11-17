// Problem:

// Given a sorted array nums[], remove the duplicate elements in-place so that each element appears only once.
// Return the number of unique elements. The relative order must remain the same.

// Approach:

// Use two pointers:

// i tracks the position of the last unique element.

// j scans through the array.
// Whenever nums[j] is different from nums[i], move i forward and copy the new unique value to nums[i].
// The array from index 0 to i will contain all unique elements.

// Time Complexity: O(n)

// (Linear scan through the array.)

// Space Complexity: O(1)

// (In-place modification with no extra memory.)


class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;

    }
}
