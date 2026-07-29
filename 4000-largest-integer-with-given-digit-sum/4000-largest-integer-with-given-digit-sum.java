class Solution {
    public int largestInteger(int n, int s) {
        if(s==0)return 0;
        if(n==1 && s<=9)return s;
        int st=0;
        
        if(n==2)st=Math.max(st,10);
        if(n==3)st=Math.max(st,100);
        if(n==4)st=Math.max(st,1000);
        if(n==5)st=Math.max(st,10000);

        
        int max=-1;

        for(int i=st;i<=st*10-1;i++){
            int num=i;
            int sum=0;

            while(num>0){
            int ele=num%10;
            sum+=ele;
            num/=10;

            }            
            if(sum==s){
                max=Math.max(sum,i);
            }

        }
        return max;
        
    }
}