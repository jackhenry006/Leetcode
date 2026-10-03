class Solution {
    public void setZeroes(int[][] matrix) {
       boolean m[]=new boolean[matrix.length];
       boolean n[]=new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    m[i]=true;
                    n[j]=true;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(m[i]||n[j]){
                    matrix[i][j]=0;
                }
            }
        }


    }
}