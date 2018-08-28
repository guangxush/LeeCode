package cn.shgx.hard;

import java.util.Stack;

/**
Given a string containing just the characters '(' and ')',
find the length of the longest valid (well-formed) parentheses substring.
Example 1:
Input: "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()"
Example 2:
Input: ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()"
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
       int res = 0,l = 0; 
       Stack<Integer> stack = new Stack<>();
       for(int i=0;i<s.length();i++) {
    	   if(s.charAt(i)=='(') {
    		   stack.push(i);
    	   }else {
    		   if(stack.isEmpty()) {
    			   l=i+1;
    		   }else {//此时为')'
    			   stack.pop();
    			   if(stack.isEmpty()) {
    				   res=Math.max(res,i-l+1);
    			   }else {
    				   res=Math.max(res, i-stack.peek());
    			   }
    		   }
    	   }
       }
       return res;
    }
    public int longestValidParentheses_DP(String s) {
    	int[] dp = new int[s.length()];
        int result = 0;
        int leftCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftCount++;
            } else if (leftCount > 0){
                dp[i] = dp[i - 1] + 2;
                dp[i] += (i - dp[i]) >= 0 ? dp[i - dp[i]] : 0;
                result = Math.max(result, dp[i]);
                leftCount--;
            }
        }
        return result;
    }
}
