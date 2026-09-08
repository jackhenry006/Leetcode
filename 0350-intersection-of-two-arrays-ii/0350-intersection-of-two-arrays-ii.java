import java.util.Arrays;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n= nums1.length+nums2.length;
             int count=0;
        int[] arr= new int[n];
   
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                 if(nums1[i]==nums2[j]){
                    arr[count]=nums2[j];
                    count = count +1;
                    nums2[j] = -1;
                   break;
                 }
            }
           
        }
        return Arrays.copyOf(arr,count);
    }
}