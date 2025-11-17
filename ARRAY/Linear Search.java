class Solution {
    public int search(int arr[], int x) {
        // code here
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i] == x){
                return i;
                
            }
        }
        return -1;
    }
}


Description:
A straightforward implementation of the Linear Search algorithm in Java.
The algorithm checks each element in the array sequentially until the target value is found.

Problem:
Given an array arr[] and a value x, return the index of x.
If x is not present, return -1.

Approach:

Start from index 0

Compare each element with x

If a match is found → return the index

If the loop ends without a match → return -1


Example:
Input: arr = [2, 4, 6, 8], x = 6
Output: 2

Complexity:

Time: O(n) — sequential check

Space: O(1) — no additional memory required
