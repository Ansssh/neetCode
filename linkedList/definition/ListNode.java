package linkedList.definition;


// Self Implemented Linked List
public class ListNode {
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
        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
