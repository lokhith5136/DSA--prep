// User function template for C++
class Solution {
  public:
    // Function to return sum of elements
    int arraySum(vector<int>& arr) {
        int sum = 0;
        int n=arr.size();
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
};



# Sum of Array

## 📌 Problem Statement
Given an array of integers, find the sum of all its elements.

## ⚡ Example
**Input:** arr = [1, 2, 3, 4, 5]  
**Output:** 15  

## ⏱️ Time Complexity
- **O(n)** → We iterate through the array once.

## 💾 Space Complexity
- **O(1)** → Only a variable is used to store the sum.

## 🎯 Notes
- A basic array problem commonly asked in coding interviews.  
- Useful for practicing iteration and array traversal.
