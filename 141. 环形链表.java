/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //方法1: 暴力法, 让程序跑0.5s, 跑完了就没有环, 否则就有环
		//方法2: 生成Set记录已遍历的节点, 利用Set的判重
		//方法3: 快慢指针
		if(head == null){
			return false;
		} //排除特殊情况
		ListNode slow = head;
		ListNode fast = head;
		while(slow != null && fast != null && fast.next != null){ //防止fast.next.next不存在
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow){
				return true;
			}
		}
		return false;
    }
}