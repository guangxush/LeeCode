package cn.shgx.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 *Implement Stack using Queues
 *Implement the following operations of a stack using queues.
 *push(x) -- Push element x onto stack.
 *pop() -- Removes the element on top of the stack.
 *top() -- Get the top element.
 *empty() -- Return whether the stack is empty.
 *Notes:
 *You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
 *Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
 *You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 */
public class ImplementStackusingQueues {
	
}
class MyStack{
	 /** Initialize your data structure here. */
    public MyStack() {
        
    }
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    /** Push element x onto stack. */
    public void push(int x) {
       if(!q1.isEmpty()) {
    	   q1.add(x);
       }else {
    	   q2.add(x);
       }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(q1.isEmpty()) {
        	int size = q2.size();
        	for(int i=1;i<size;i++) {
        		q1.offer(q2.poll());
        	}
        	return q2.poll();
        }else {
        	int size = q1.size();
        	for(int i=1;i<size;i++) {
        		q2.offer(q1.poll());
        	}
        	return q1.poll();
        }
    }
    
    /** Get the top element. */
    public int top() {
        int result;
        if(q1.isEmpty()) {
        	int size = q2.size();
        	for(int i=1;i<size;i++) {
        		q1.add(q2.poll());
        	}
        	result = q2.poll();
        	q1.add(result);
        }else {
        	int size = q1.size();
        	for(int i=1;i<size;i++) {
        		q2.add(q1.poll());
        	}
        	result = q1.poll();
        	q2.add(result);
        }
        return result;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty()&&q2.isEmpty();
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
