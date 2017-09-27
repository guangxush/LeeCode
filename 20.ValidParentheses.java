package cn.shgx.easy;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("[{()}]"));
		System.out.println(isValid1("[12+{{321-(321+21)/24}*15]"));
	}
	public static boolean isValid(String s) {
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<s.length();i++) {
			char temp = s.charAt(i);
			if(temp=='{'||temp=='('||temp=='[') {
				stack.push(temp+"");
			}else {
				if(stack.isEmpty())
					return false;
				if((temp=='}'&&stack.peek().equals("{"))
					||(temp==')'&&stack.peek().equals("("))
					||(temp==']'&&stack.peek().equals("["))){
					stack.pop();
				}else {
					return false;
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}
	public static boolean isValid1(String s) {
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<s.length();i++) {
			char temp = s.charAt(i);
			if(temp=='{'||temp=='('||temp=='[') {
				stack.push(temp+"");
			}else if((temp=='}'&&stack.peek().equals("{"))
					||(temp==')'&&stack.peek().equals("("))
					||(temp==']'&&stack.peek().equals("["))){
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}
}
