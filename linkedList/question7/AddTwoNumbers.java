package linkedList.question7;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode op = res;
        int carry = 0;
        int l1Val, l2Val;
        while(l1 != null || l2 != null){
            l1Val = l1 == null ? 0 : l1.val;
            l2Val = l2 == null ? 0 : l2.val;
            res.next = new ListNode((l1Val + l2Val + carry) % 10);
            if (l1Val + l2Val + carry > 9) {
                carry = 1;
            }else{
                carry = 0;
            }
            res = res.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (carry == 1) {
            res.next = new ListNode(carry);
        }
        ListNode.print(op.next);
        return op.next;
    }
}


public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution x = new Solution();
        ListNode a1 = new ListNode(6, new ListNode(5, new ListNode(9)));
        ListNode a2 = new ListNode(5, new ListNode(9));
        x.addTwoNumbers(a1,a2);        
    }
}
