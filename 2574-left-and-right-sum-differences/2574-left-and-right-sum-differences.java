class Solution {
    public int[] leftRightDifference(int[] nums) {
        int answer[]=new int[nums.length];
        int leftSum=0;
        
        int total=0;
for(int i=0;i<nums.length;i++){
    total +=nums[i];
}
        for(int i=0;i<nums.length;i++){
            int rightSum=total-leftSum-nums[i];
            answer[i]=Math.abs(leftSum-rightSum);
            leftSum+=nums[i];
        }
        return answer;
    }
}