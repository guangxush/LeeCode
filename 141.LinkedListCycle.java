package cn.shgx.easy;


/**
 * Given a linked list, determine if it has a cycle in it.
 * Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
	   ListNode fast = head;
	   ListNode slow = head;
       if(head==null) {
    	   return false;
       }
       if(head.next==null) {
    	   return false;
       }
       while(fast!=null&&fast.next!=null) {
    	   slow=slow.next;
    	   fast=fast.next.next;
    	   if(fast==slow) {
    		   return true;
    	   }
       }
       return false;
    }
}
