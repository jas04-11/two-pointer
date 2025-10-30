/*Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 
*/

import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxArea=0;
        int i=0;
        int j=n-1;
        while(i<j){
            int currArea=(Math.min(height[i],height[j]))*(j-i);
            maxArea=Math.max(currArea,maxArea);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}
