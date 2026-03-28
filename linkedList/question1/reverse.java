package linkedList.question1;

// Given Definition of Linked List
class ListNode {
    int val;
    ListNode next;
    public ListNode() {}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}

public class Reverse {
    public static void main(String[] args) {
        Solution x = new Solution();
        ListNode input = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        ListNode res = x.reverseList(input);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
