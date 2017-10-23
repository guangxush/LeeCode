package cn.shgx.easy;

import java.util.Stack;


/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
public class MinStack {
	/** initialize your data structure here. */
	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> minStack = new Stack<>();
	
    public MinStack() {

    }
    
    public void push(int x) {
    	 if(minStack.isEmpty()||x<=minStack.peek()) {
         	minStack.push(x);
         }
         stack.push(x);
    }
    
    public void pop() {
    	if(stack.peek().equals(minStack.peek())) {
        	minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class MinStack1 {
	/** initialize your data structure here. */
	private final static int DEFAULT_SIZE = 1000;
	private int[] stack;
	private int[] minIndex;//用于保存栈中前n个元素中最小元素的下标
	private int min = Integer.MAX_VALUE;//用于记录插入过程中的最小数据
	private int index = -1;//记录最小元素在stack中的位置
	private int current = -1;
    public MinStack1() {
    	stack = new int[DEFAULT_SIZE];
    	minIndex = new int[DEFAULT_SIZE];
    }
    
    public MinStack1(int size) {
    	stack = new int[size];
    	minIndex = new int[size];
    }
    
    public void push(int x) {
    	 current ++;//移动要插入的位置
    	 if(current>=stack.length) {
    		 //扩容
    		 int[] temp = new int[current*2];
    		 System.arraycopy(stack, 0, temp, 0, stack.length);
    		 stack = temp;
    		 temp = new int[current*2];
    		 System.arraycopy(minIndex, 0, temp, 0, minIndex.length);
    		 minIndex = temp;
    	 }
    	 stack[current] = x;//插入数据
    	 if(x<min) {
    		 min = x;
    		 index = current;
    	 }
    	 minIndex[current] = index;
    }
    
    public void pop() {
    	current--;
    	if(current>0) {
    		min = stack[minIndex[current]];//重新设置栈中的最小值
    		index = minIndex[current];//重置最小值索引
    	}
    }
    
    public int top() {
        if(current<0) {
        	throw new RuntimeException("No more data");
        }
        return stack[current];
    }
    
    public int getMin() {
    	if(current<0) {
        	throw new RuntimeException("No more data");
        }
        return stack[minIndex[current]];
    }
}
