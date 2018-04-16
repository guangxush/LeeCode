package cn.shgx.medium;
/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	if(l1==null||l2==null) return null;
    	ListNode temp = new ListNode(0);
    	ListNode result = temp;
    	int value1 = 0;
    	int value2 = 0;
    	while(l1!=null&&l2!=null) {
    		value2 = (l1.val+l2.val+value1)%10;
    		value1 = (l1.val+l2.val+value1)/10;
    		temp.next = new ListNode(value2);
    		l1 = l1.next;
    		l2 = l2.next;
    		temp = temp.next;
    		if(l1==null&&l2==null) break;
    		if(l1==null) l1 = new ListNode(0);
    		if(l2==null) l2 = new ListNode(0);
    	}
    	if(value1!=0)
    		temp.next = new ListNode(value1);
    	return result.next;
    }
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
    	if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
    	int value = l1.val+l2.val;
    	ListNode result = new ListNode(value%10);
    	result.next = addTwoNumbers1(l1.next, l2.next);
    	if(value>=10)
    		result.next = addTwoNumbers1(new ListNode(value/10),result.next);
    	return result;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
