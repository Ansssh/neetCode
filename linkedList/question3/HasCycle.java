package linkedList.question3;

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
    public boolean hasCycle(ListNode head) { 
        ListNode one = head;
        ListNode two = head;
        while (head != null) {
            if (one.next == null || two.next == null || two.next.next == null) {
                return false;
            }
            one = one.next;
            two = two.next.next;
            if (one == two) {
                return true;
            }     
        }        
        return false;
    }
}

public class HasCycle {
    public static void main(String[] args) {
        Solution x = new Solution();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        System.out.println(x.hasCycle(a));
    }
}
