/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null){
            return head;
        } //排除特殊情况, 便于后续操作
		ListNode a = head;
		ListNode b = a.next;
		a.next = b.next;
		b.next = a;
		head = b; //新的头指针
		ListNode prev = a; //记录前一个节点
		while(prev.next != null && prev.next.next != null){
			a = prev.next;
			b = a.next;
			a.next = b.next;
			b.next = a;
			prev.next = b;
			prev = a;
		}
		return head;
    }
}

class Solution { //递归方法
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}