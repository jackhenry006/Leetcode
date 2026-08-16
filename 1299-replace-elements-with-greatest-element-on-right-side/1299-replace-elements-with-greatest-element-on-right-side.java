class Solution {
    public int[] replaceElements(int[] arr) {
        
        int maxSoFar=0;
        for(int i=arr.length-1;i>=0;i--){
           int original = arr[i];  
    
    arr[i] = maxSoFar;   
    
    if (original > maxSoFar) {
        maxSoFar = original;  
                              
    }

        }
        arr[arr.length-1]=-1;
        return arr;
    }
}