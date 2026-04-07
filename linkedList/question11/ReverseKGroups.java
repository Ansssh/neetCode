package linkedList.question11;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static void printNode(ListNode head){
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}


class Solution {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res = new ListNode();
        ListNode resPtr = res;
        ListNode ptr = head;
        ListNode subList;
        while (ptr != null) {
            subList = ptr;
            for (int i = 0; i < k - 1; i++) {
                if (ptr.next == null) {
                    resPtr.next = subList;
                    return res.next;
                }
                ptr = ptr.next;
            }
            ListNode temp = ptr.next;
            ptr.next = null;
            resPtr.next = this.reverseList(subList);
            while (resPtr.next != null) {
                resPtr = resPtr.next;
            }
            ptr = temp;
        }
        return res.next;
    }
}


public class ReverseKGroups {
    public static void main(String[] args) {
        Solution x = new Solution();
        // ListNode.printNode(x.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
        ListNode.printNode(x.reverseKGroup(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 3));
    }
}
