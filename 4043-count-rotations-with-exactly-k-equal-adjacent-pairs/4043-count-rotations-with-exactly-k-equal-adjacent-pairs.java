class Solution {
    public int countRotations(String s, int k) {
        int count=0;
        int n=s.length();

        for(int st=0;st<n;st++){
            int score=0;

            for(int i=0;i<n-1;i++){

                if(s.charAt((st+i)%n) == s.charAt((st+i+1)%n)){
                    score++;
                }
                
            }
            if(score==k){
                    count++;
                }
        }
        return count;
        
    }
}