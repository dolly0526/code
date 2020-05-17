/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        
        RandomListNode currNode = pHead;
        //复制A节点为A', 放在A的后面
        while (currNode != null) {
            RandomListNode cloneNode = new RandomListNode(currNode.label);
            cloneNode.next = currNode.next;
            currNode.next = cloneNode;
            currNode = cloneNode.next;
        }
        //复制random指针
        currNode = pHead;
        while (currNode != null) {
            RandomListNode cloneNode = currNode.next;
            if (currNode.random != null)
                cloneNode.random = currNode.random.next;
            currNode = cloneNode.next;
        }
        //拆分链表, 但为什么要把原链表还原回去??
        RandomListNode newHead = pHead.next;
        currNode = pHead;
        while (currNode.next != null) {
            RandomListNode cloneNode = currNode.next;
            currNode.next = cloneNode.next;
            currNode = cloneNode;
        }
        return newHead;
    }
}