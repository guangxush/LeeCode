package cn.shgx.medium;
/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * Example:
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Note:
 * Your algorithm should use only constant extra space.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
        	return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode current = newHead;
        ListNode toBeInsert = current.next.next;
        while(current!=null&&toBeInsert!=null) {
        	current.next.next=toBeInsert.next;
        	toBeInsert.next=current.next;
        	current.next=toBeInsert;
        	current=toBeInsert.next;
        	if(current.next!=null&&current.next.next!=null) {
        		toBeInsert=current.next.next;
        	}else {
        		break;
        	}
        }
        return newHead.next;
    }
}
