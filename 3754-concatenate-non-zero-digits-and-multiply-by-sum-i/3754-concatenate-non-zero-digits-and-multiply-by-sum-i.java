class Solution {
    public long sumAndMultiply(int n) {

        StringBuilder sb=new StringBuilder();
        long sum=0;
        if(n==0)return 0;
        long x=0;
        while(n>0){
            x=n%10;
            if(x!=0){
            sum+=x;
            sb.append(x);

            }
            
            n/=10;
        }
        sb.reverse();
        long x1=Long.parseLong(sb.toString());
        return x1*sum;
        
    }
}