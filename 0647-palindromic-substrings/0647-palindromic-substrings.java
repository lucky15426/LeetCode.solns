class Solution {
    public int countSubstrings(String s) {
        int res=0;
        int n =s.length();

        for(int i=0;i<s.length();i++){
            int l=i;
            int r=i;

            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                res++;
                l--;
                r++;
            }

            int lf=i;
            int rh=i+1;

            while(lf>=0 && rh<n && s.charAt(lf)==s.charAt(rh)){
                res++;
                lf--;
                rh++;
            }
        }
        return res;
        
    }
}