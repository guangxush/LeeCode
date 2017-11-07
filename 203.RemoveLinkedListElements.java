package cn.shgx.easy;
/**
 * Remove all elements from a linked list of integers that have value val.
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveLinkedListElements {
	 public ListNode removeElements(ListNode head, int val) {
		 ListNode dummy = new ListNode(0);
		 dummy.next = head;
		 ListNode p = dummy;
		 ListNode q = head;
		 while(q!=null) {
			 if(q.val==val) {
				 p.next = q.next;
			 }else {
				 p = p.next;
			 }
			 q = q.next;
		 }
		 return dummy.next;
	 }
	 public ListNode removeElements1(ListNode head, int val) {
		 while(head!=null&&head.val==val) 
			 head =head.next;
		 ListNode curr = head;
		 while(curr!=null&&curr.next!=null) {
			 if(curr.next.val==val)
				 curr.next = curr.next.next;
			 else
				 curr = curr.next;
		 }
		 return head;
	 }
}
