class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats=0;
        Arrays.sort(people);
        int l=0;
        int r=people.length-1;
        int sum=0;
        
        while(l<=r){
            if(people[l]+people[r]<=limit){
                l++;
            }
                r--;
                boats++;
            
        }
        return boats;
    }
}