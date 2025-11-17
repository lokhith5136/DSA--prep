// Problem:

// Given an array arr[], find and return the largest element in the array.

// Approach:

// Initialize a variable to the smallest possible integer.
// Traverse the array and update the variable whenever a bigger value is found.
// Return the final value.

// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public static int largest(int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
