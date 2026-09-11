class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer>set=new HashSet<>();
        int n=digits.length;

        for(int h=0;h<n;h++){
            if(digits[h]==0)continue;

            for(int t=0;t<n;t++){
                if(t==h)continue;

                for(int o=0;o<n;o++){
                    if(o==h || o==t)continue;

                    if(digits[o]%2!=0)continue;

                    int num=digits[h]*100+digits[t]*10+digits[o];

                    set.add(num);


                }
            }
        }
        return set.size();
    }
}