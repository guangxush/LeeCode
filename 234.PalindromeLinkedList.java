package cn.shgx.easy;

/**
 *Given a singly linked list, determine if it is a palindrome.
 *Follow up:
 *Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
       ListNode end = head;
       ListNode mid = head;
       while(end!=null&&end.next!=null) {
    	   end = end.next.next;
    	   mid = mid.next;
       }
       if(end!=null)//奇数情况下
    	   mid = mid.next;
       mid = reverseList(mid);
       while(mid!=null) {
    	   if(mid.val!=head.val) {
    		   return false;
    	   }
    	   mid = mid.next;
    	   head= head.next;
       }
       return true;
    }
	public ListNode reverseList(ListNode head) {//链表反转
		ListNode pre =null,next=null;
		while(head!=null) {
			next = head.next;
			head.next = pre;
			pre= head;
			head=next;
		}
		return pre;
	}
}
