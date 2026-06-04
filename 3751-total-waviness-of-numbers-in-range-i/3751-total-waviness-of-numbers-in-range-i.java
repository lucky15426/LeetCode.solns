class Solution {
    public int totalWaviness(int num1, int num2) {
        int score=0;
        for(int num=num1;num<=num2;num++){
            
        score+=findWave(num);
        }
        return score;
        
    }
    private int findWave(int num){
        
        String s =Integer.toString(num);
        if(s.length()<3){
            return 0;
        }
        int score=0;

        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)<s.charAt(i+1) && s.charAt(i)<s.charAt(i-1)){
                score++;
            }
            if (s.charAt(i)>s.charAt(i-1)&&s.charAt(i)>s.charAt(i+1)){
                score++;
            }
        }
        return score;

    }
}