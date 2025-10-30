/*Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */
//sol 1
/*class Solution {
    public void moveZeroes(int[] nums) {
       int start=0;
       
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[start];
            nums[start++]=temp;
        
        }
       } 
    }
}*/


//sol2
/*class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        
        //if i not equal to 0 then shift all to front
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }

        //then set 0 to remaining index
        while(index<n){
            nums[index++] = 0;
        }
    }
}*/


class Solution {
    public void moveZeroes(int[] nums) {
       int j=0;
       int n=nums.length;
       for(int i=0;i<n;i++){
        if(nums[i]!=0){
            nums[j]=nums[i];
            j++;
        }
       }
       while(j<n){
            nums[j++] = 0;
        } 
    }
}
