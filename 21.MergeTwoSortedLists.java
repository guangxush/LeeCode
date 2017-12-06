package cn.shgx.easy;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists {
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	     ListNode head = new ListNode(0);
	     ListNode p = head;
	     while(l1!=null||l2!=null) {
	    	 if(l1==null||(l2!=null&&l1.val>=l2.val)) {
	    		 p.next=l2;
	    		 p=l2;
	    		 l2=l2.next;
	    	 }else{
	    		 p.next=l1;
	    		 p=l1;
	    		 l1=l1.next;
	    	 }
	     }
	     return head.next;
	 }
	 public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
		 if(l1==null) return l2;
		 if(l2==null) return l1;
	     ListNode head = new ListNode(0);
	     ListNode p = head;
	     while(l1!=null||l2!=null) {
	    	 if(l1==null||(l2!=null&&l1.val>=l2.val)) {
	    		 p.next=l2;
	    		 p=l2;
	    		 l2=l2.next;
	    	 }else{
	    		 p.next=l1;
	    		 p=l1;
	    		 l1=l1.next;
	    	 }
	     }
	     return head.next;
	 }
}
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){ val = x;}
}
