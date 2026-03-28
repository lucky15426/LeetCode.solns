class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int max=0;
        int curr=0;
        int n=arr.length;

        for(int i=0;i<arr.length;i++){
            if(i>=2 &&((arr[i-2]>arr[i-1]&&arr[i-1]<arr[i])||(arr[i-2]<arr[i-1] && arr[i-1]>arr[i]))){
                curr++;
            }else if(i>=1 && arr[i-1]!=arr[i]){
                curr=2;
            }else{
                curr=1;
            }
            max=Math.max(curr,max);
        }
        return max;
    }
}