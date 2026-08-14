class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        
    int i=0;
    while(i<nums.length){
        int value=0;
        for(int j=i+1;j<nums.length;j++){
            value=nums[i]+nums[j];
            if(value==target){
                return new int[]{i,j};
            }
        }
        i++;
    }
    return new int[]{-1,-1};
    }
}