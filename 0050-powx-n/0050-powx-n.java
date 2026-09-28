class Solution {
    public double myPow(double x, int n) {
        // double mul=1;
        //  double ans=0;
        //    if(n>0){
        //     for(int i=1 ;i<=n;i++){
        //         mul=mul*x;
        //     }
        //     return mul;
        //     }
        
         
        //     if(n<0){
        //         for(int i=1;i<=Math.abs(n);i++){
        //             mul=mul*x;
        //             ans=1/mul;
        //         }
                
        //     }
        // return ans;


        long binForm=n;
        double ans=1;
        if(n<0){
            x=1/x;
            binForm=-binForm;
        }

        while(binForm>0){
            if(binForm%2==1){
                ans *=x;
            }
            x*=x;
            binForm /=2;
        }
        return ans;
    }

}