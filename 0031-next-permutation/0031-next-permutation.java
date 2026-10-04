class Solution {
    public void nextPermutation(int[] nums) {
       int pivot = -1;
       for(int i=nums.length-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            pivot=i;
            break;
        }
       }
        if(pivot == -1){
            reverse(nums , pivot);
            return;
        } 
       for(int j=nums.length-1;j>pivot;j--){
            if(nums[j]>nums[pivot]){
                int temp=nums[j];
                nums[j]=nums[pivot];
                nums[pivot]=temp;
                break;
            }
        }

      reverse(nums,pivot);

    }


    private void reverse(int nums[],int start){
        int left=start+1;
        int right=nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}