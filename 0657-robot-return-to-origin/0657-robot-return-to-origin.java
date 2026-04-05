class Solution {
    public boolean judgeCircle(String moves) {
        int n=moves.length();
        int R=0,L=0,U=0,D=0;

        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='U'){
                U++;
            }else if(moves.charAt(i)=='D'){
                D++;
            }else if(moves.charAt(i)=='L'){
                L++;
            }else{
                R++;
            }
        }
        if(R==L&&U==D){
            return true;
        }
        return false;
        
    }
}