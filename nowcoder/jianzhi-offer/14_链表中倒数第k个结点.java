/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k == 0) return null;
        //快慢指针
        ListNode fast = head, slow = head;
        //快指针先走k-1步, 若不足k-1则返回空
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
            if (fast == null) return null;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}