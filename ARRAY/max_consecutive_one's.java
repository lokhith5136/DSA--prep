// Problem:

// Given a binary array arr[] (containing only 0s and 1s), find the maximum number of consecutive 0s or 1s present in the array.

// Approach:

// Traverse the array while maintaining two counters:

// cnt1 for consecutive 1s

// cnt2 for consecutive 0s

// Reset the counter when the streak breaks. Track the maximum streak using maxi1 and maxi2.
// Return the maximum of both.

// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int cnt1= 0,  cnt2 = 0;
        int maxi1 =0,  maxi2 = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 1){
                cnt1++;
                maxi1= Math.max(maxi1,cnt1);
            }
            else{
                cnt1 = 0;
            }
            if(arr[i] == 0){
                cnt2++;
                maxi2= Math.max(maxi2,cnt2);
            }
            else{
                cnt2 = 0;
            }
        }
    
        return Math.max(maxi1,maxi2);
    }
}
