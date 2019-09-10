/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
		ListNode curr = head;
		while(curr != null){
			ListNode temp = curr.next; //设置临时指针存放下一个节点
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
    }
}