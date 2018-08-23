package cn.shgx.hard;

import cn.shgx.medium.ListNode;

/**
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
Example:
Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
 */
public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        return partion(lists,0,lists.length-1);
    }
    public static ListNode partion(ListNode[] lists,int s,int e) {
    	if(s==e) return lists[s];
    	if(s<e) {
    		int q = (s+e)/2;
    		ListNode l1 = partion(lists,s,q);
    		ListNode l2 = partion(lists,q+1,e);
    		return merge(l1,l2);
    	}else
    		return null;
    }
    public static ListNode merge(ListNode l1,ListNode l2) {
    	if(l1==null) return l2;
    	if(l2==null) return l1;
    	if(l1.val<l2.val) {
    		l1.next=merge(l1.next,l2);
    		return l1;
    	}else {
    		l2.next=merge(l1,l2.next);
    		return l2;
    	}
    }
}
