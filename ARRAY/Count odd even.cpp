class Solution {
  public:
    /*Function to count even and odd elements in the array
     * arr : Array with its elements
     */
    pair<int, int> countOddEven(vector<int> &arr) {
        int n = arr.size();
        int even =0;
        int odd =0;
        for (int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        
        }
        return {odd,even};
        
    }
};

# Count Odd and Even

**Problem:**  
Given an array of positive integers, count the number of odd and even elements.  

**Example:**  
Input: `[1, 2, 3, 4, 5]`  
Output: `Odd = 3, Even = 2`  

**Approach:**  
- Traverse the array  
- Use modulo operator (`% 2`)  
- Count odds and evens separately  

**Complexity:**  
- Time: `O(n)`  
- Space: `O(1)`
