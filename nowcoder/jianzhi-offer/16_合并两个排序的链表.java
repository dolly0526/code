/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null || list2 == null)
            return list1 == null ? list2 : list1;
        //记录新的头节点, 预处理list1和list2两个遍历用的指针
        ListNode head = null;
        if (list1.val <= list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        //跟在list1和list2两个指针前面, 用来构造新链表
        ListNode prev = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                prev = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                prev = list2;
                list2 = list2.next;
            }
        }
        //剩余部分
        prev.next = list1 == null ? list2 : list1;
        return head;
    }
}