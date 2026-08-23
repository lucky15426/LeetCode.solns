class Solution {
    public boolean sumGame(String num) {
        int sum1=0;
        int sum2=0;
        int q1=0,q2=0;
        int n=num.length();

        for(int i=0;i<n/2;i++){
            if(num.charAt(i)!='?'){
                sum1+=num.charAt(i)-'0';

            }else{
                q1++;
            }
        }

        for(int i=n/2;i<n;i++){
            if(num.charAt(i)!='?'){
                sum2+=num.charAt(i)-'0';
            }else{
                q2++;
            }
        }

        int diff= 2*(sum1-sum2)+ 9*(q1-q2);

        return diff!=0;
    }
}