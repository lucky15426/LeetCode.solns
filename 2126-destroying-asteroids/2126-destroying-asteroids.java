class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        
        int n=asteroids.length;
        long currMass=mass;

        for(int right=0;right<n;right++){
            if(currMass>=asteroids[right]){
                currMass+=asteroids[right];
                

            }else{
                return false;
            }
            

          


        }
        return true;
    }
}