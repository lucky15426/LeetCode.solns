class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int mid=n/2;
        char str[]=s.substring(0,mid).toCharArray();

        Arrays.sort(str);

        String left=new String(str);
        String right=new StringBuilder(left).reverse().toString();

        if(n%2==0)return left+right;

        return left+s.charAt(mid)+right;
        
    }
}