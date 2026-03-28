package linkedList.question2;

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        temp.next = list1 == null ? list2 : list1;
        return res.next;
    }
}

public class MergeLists {
    public static void main(String[] args) {
        Solution x = new Solution();
        ListNode input = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(7, new ListNode(9, new ListNode(11))))));
        ListNode input2 = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8, new ListNode(10, new ListNode(12))))));
        ListNode res = x.mergeTwoLists(input, input2);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
