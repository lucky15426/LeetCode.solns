class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        if(n==1)return s;
        int mid=n/2;
        char arr[]=s.substring(0,mid).toCharArray();
        Arrays.sort(arr);

        String left=new String(arr);
        String right=new StringBuilder(left).reverse().toString();

        if(n%2==0){
            return left+right;
        }

        return left+s.charAt(n/2)+right;
        
    }
}