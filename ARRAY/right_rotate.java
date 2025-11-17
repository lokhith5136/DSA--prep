// Problem:

// Rotate the array clockwise by 1 position.
// Move the last element to the front and shift all other elements to the right by one.

// Approach:

// Store the last element in a temporary variable.
// Shift all elements from right to left by one position.
// Place the stored element at index 0.

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void rotate(int[] arr) {
        // code here
        if(arr==null||arr.length<=1){
            return;
        }
        int temp = arr[arr.length-1];
        for (int i =arr.length-1; i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}
