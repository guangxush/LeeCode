package cn.shgx.medium;
/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * Example:
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5
 * Note:
 * Given n will always be valid.
 */
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode first = head;
        ListNode second = res;
        while(first!=null) {
        	if(n--<=0) {
        		second=second.next;
        	}
        	first=first.next;
        }
        second.next = second.next.next;
        return res.next;
    }
}
/**
 * 设置两个指针first跟second。first指针先移动n步，若此时first指针为空，
 * 则表示要删除的是头节点，此时直接返回head->next即可。如果first指针不为空，
 * 则将两个指针一起移动，直到first指针指向最后一个节点，
 * 令second->next=second->next->next即可删除第你n个节点。
 */
