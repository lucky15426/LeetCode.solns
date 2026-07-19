import java.util.*;

class Solution {
    public String smallestSubsequence(String s) {

        // Store last occurrence of every character
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Already present in answer
            if (set.contains(ch))
                continue;

            // Remove larger characters if they appear later
            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && last[stack.peek() - 'a'] > i) {

                char removed = stack.pop();
                set.remove(removed);
            }

            stack.push(ch);
            set.add(ch);
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}