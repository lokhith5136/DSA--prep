class Solution {
  public:
    bool isSorted(vector<int>& arr) {
        int n=arr.size();
        for (int i=1;i<n;i++){
            if (arr[i]<arr[i-1]){
                return false;
            }
                
        }
        return true;
    }
};

# Check if Array is Sorted

**Problem:**  
Given an array of integers, check whether the array is sorted in non-decreasing order.

**Example:**  
Input: `[1, 2, 3, 4, 5]`  
Output: `true`  

Input: `[1, 3, 2, 4, 5]`  
Output: `false`  

**Approach:**  
- Iterate from index `1` to `n-1`  
- If any element is smaller than its previous element → return `false`  
- Otherwise, return `true`  

**Complexity:**  
- Time: `O(n)`  
- Space: `O(1)`
