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


Problem:
Given an array arr[] and a value x, find the index of x. If x is not present, return -1.

Approach:
Scan the array from left to right and compare each element with x. Return the index when found; otherwise return -1.

Time Complexity: O(n)
Space Complexity: O(1)
