class Solution {
  public:
    void reverseArray(vector<int> &arr) {
        int start=0;
        int end=arr.size()-1;
        while(start<=end){
            swap(arr[start],arr[end]);
            start++;
            end--;
        }
    }
};

# Reverse an Array

**Problem:**  
Given an array of integers, reverse the array.

**Example:**  
Input: `[1, 2, 3, 4, 5]`  
Output: `[5, 4, 3, 2, 1]`  

**Approach:**  
- Use two-pointer technique: swap first and last elements, move towards center  
- Or use STL `reverse()` function in C++  

**Complexity:**  
- Time: `O(n)`  
- Space: `O(1)`
