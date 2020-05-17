/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        //三个指针, next记录前进位置, prev和curr用来反转
        ListNode prev = null, curr = head, next = head.next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            //prev之前均已反转
            prev = curr;
            curr = next;
        }
        return prev;
    }
}