// Problem:

// Given an array arr[], return the second largest distinct element.
// If it does not exist (array size < 2 or all elements are equal), return -1.

// Approach:

// Traverse the array once while maintaining two variables:

// largest

// slargest (second largest)

// Update them based on comparisons. Ensure slargest captures the next distinct value.

// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        if(n<2){
            return -1;
        }
        int largest = -1;
        int slargest = -1;
        for(int i = 0; i<n ; i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
}
