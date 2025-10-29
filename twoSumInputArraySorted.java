/*
Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].


Approach used: two pointer,
i and j pointers one at start and one at end
*/




class Solution {
    public int[] twoSum(int[] num, int target) {
        int i=0;
        int j=num.length-1;
        while(i<j){
            int sum=num[i]+num[j];
            if(sum==target) return new int[]{i+1,j+1};
            else if(sum<target) i++;
            else j--;
        }
    return new int[]{-1, -1};
    }
}
