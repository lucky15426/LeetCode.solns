class Solution {
    public boolean isHappy(int n) {
        if(n==1)return true;
        

        int sum=0;
        

        while(n!=1){


        sum=0;  

        while(n>0){
             int x=n%10;
        sum+=x*x;
        n=n/10;

        }      
       
        
        if(sum==1){
            return true;

        }else if(sum <10 && sum !=7){
            return false;
           

        }
        n=sum;
        }
        return true;
            
        
         
    }
}