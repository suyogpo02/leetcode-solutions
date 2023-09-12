package com.leetcode.solutions.stack;

import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        final Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++ ){
            Character curr = s.charAt(i);
            if(isLeftParanthesis(curr)){
                st.push(curr);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char left = st.pop();
                boolean correct = verify(left, curr);
                if(!correct){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    private boolean isLeftParanthesis(char c){
        return c == '(' || c == '{' || c == '[';
    }

    private boolean verify(char l, char r) {
        return (l == '(' && r == ')')
                || (l == '{' && r == '}')
                || (l == '[' && r == ']');
    }

    public static void main(String[] args) {
        List<String> parenthesesList = List.of("()[]{}", "()[]{{");
        ValidParentheses vp = new ValidParentheses();
        parenthesesList.
                forEach(string ->
                        System.out.println("The String " + string + " is " +
                                (vp.isValid(string) ? "valid" : "not valid"))
                );
    }
}
