package linkedList.question4;


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
    public static void print(ListNode head){
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

class Solution{
    public static void merge(ListNode head, ListNode merge){
        ListNode.print(head);
    }
        public void reorderList(ListNode head) {
            ListNode a = head;
            ListNode b = head;
            while (b != null && b.next != null && b.next.next != null) {
                a = a.next;
                b = b.next.next;            
            }  
            ListNode secondHalf = a.next;
            a.next = null;

            ListNode temp, prev = null;
            ListNode curr = secondHalf;
            while (curr != null) {
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }  
            ListNode home = head;
            while (prev != null) {
                ListNode t1 = home.next;
                ListNode t2 = prev.next;
                home.next = prev;
                prev.next = t1;
                home = t1;
                prev = t2;
            }
        }
}

public class ReorderList {
    public static void main(String[] args) {
        Solution x = new Solution();
        ListNode inp = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
        x.reorderList(inp);
    }
}
