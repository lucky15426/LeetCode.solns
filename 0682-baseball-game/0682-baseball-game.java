class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();

        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(st.peek()*2);
            }
            else if(s.equals("+")){
                int leaved=st.pop();
                int top=st.peek();
                int sum=top+leaved;
                st.push(leaved);
                st.push(sum);
                

            }

            else{
                st.push(Integer.parseInt(s));
            }
        }

        int sum=0;

        for(int i=0;i<st.size();i++){
            sum+=st.get(i);

        }

        return sum;


        
    }
}