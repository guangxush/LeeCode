package cn.shgx.easy;
/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * Note: Do not modify the linked list.
 * Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
    	//假设环的起点是第m个节点，总长度是n
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null) {
        	fast = fast.next.next;
        	slow = slow.next;
        	if(fast==slow) {
        		//第一次相遇在k节点,此时慢指针只需走n-k到达开头
        		//此时快指针已经走了m+k步
        		fast = head;
        		while(slow!=fast) {
        			slow= slow.next;
        			fast= fast.next;
        		}
        		return slow;
        	}
        }
        return null;
    }
}
