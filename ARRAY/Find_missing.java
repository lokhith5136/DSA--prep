// Problem:

// You are given an array nums[] containing n distinct numbers from 0 to n.
// Exactly one number is missing.
// Return the missing number.

// Approach (XOR Method):

// XOR all numbers from 1 to n → store in xor1.

// XOR all elements of the array → store in xor2.

// The XOR of xor1 and xor2 gives the missing number.
// This works because duplicates cancel out in XOR.

// Time Complexity: O(n)

// (Single loop over the array.)

// Space Complexity: O(1)

// (Only two integer variables used.)

class Solution {
    public int missingNumber(int[] nums) {
        int xor1 =0;
        int xor2 = 0;
        for(int i = 0; i<nums.length; i++){
            xor1 = xor1 ^ (i+1);
            xor2 = xor2 ^ nums[i];
        }
        return (xor1 ^ xor2);
    }
}
