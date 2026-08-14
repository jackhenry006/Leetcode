import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int ans=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=i){
            ans=i;
            break;
        }
        else{
            ans=nums.length;
            
        }
    }
    return ans;
    }
}