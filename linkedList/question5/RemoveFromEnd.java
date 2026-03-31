package linkedList.question5;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static void print(ListNode head){
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = new ListNode(-1);
        slow.next = head;
        ListNode dummy = slow;
        while (fast != null) {
            if (n <= 0) {
                slow = slow.next;
            }
            fast = fast.next;
            n--;
        }
        ListNode pop = slow.next.next;
        slow.next = pop;
        return dummy.next;
    }
}


public class RemoveFromEnd {
    public static void main(String[] args) {
        Solution x = new Solution();
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
        ListNode.print(x.removeNthFromEnd(input, 7));

    }
}
