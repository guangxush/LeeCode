package cn.shgx.easy;

/**
 * Given a sorted linked list, delete all duplicates such that each element 
 * appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
//class ListNode{//其他文件中已经定义
//  	int val;
//  	ListNode next;
//  	ListNode(int x){val = x;}
//}
public class RemoveDuplicatesfromSortedList {
	public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
        	return head;
        ListNode temp =head;
        while(temp.next!=null) {
        	if(temp.next.val==temp.val) {
        		temp.next=temp.next.next;
        	}else{
        		temp=temp.next;
        	}
        }
        return head;
    }
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(1);
		listNode.next.next = new ListNode(2);
		ListNode result = deleteDuplicates(listNode);
		System.out.println(result.val);
		System.out.println(result.next.val);
	}
}
