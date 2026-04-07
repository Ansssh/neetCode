package linkedList.question10;


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
    ListNode res;
    Solution(){
        res = new ListNode();
    }
    public void mergeWithRes(ListNode head){
        ListNode sol = res;
        while (sol.next != null || head != null) {
            int v1 = sol.next == null ? 1001 : sol.next.val;
            int v2 = head == null ? 1001 : head.val;
            if (v1 > v2) {
                ListNode node = sol.next;
                ListNode next = head.next;
                sol.next = head;
                sol.next.next = node;
                head = next;
            }else{
                sol = sol.next;
            }
        }
        ListNode.printNode(res);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        for(ListNode x : lists) mergeWithRes(x);
        return res.next;
    }
}

public class MergeKLists {
    public static void main(String[] args) {
        Solution x = new Solution();
        ListNode.printNode(x.mergeKLists(new ListNode[]{new ListNode(1, new ListNode(3, new ListNode(5))), new ListNode(1, new ListNode(3, new ListNode(5))), new ListNode(2, new ListNode(4, new ListNode(6)))}));
    }
}
