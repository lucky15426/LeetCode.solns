class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;

        int st=0;
        int end=n-1;

        while(st<=end){
            int mid=st+(end-st)/2;
            for(int i=0;i<m;i++){
                if(matrix[mid][i]==target){
                    return true;

                }
            }
            
             if(matrix[mid][0]>target){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            

        }
        return false;

        
    }
}