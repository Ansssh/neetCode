package linkedList.question6;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print("[");
            System.out.print(head.val + "," + (head.random == null ? "null" : head.random.val));
            System.out.print("]");
            System.out.print(" -> ");
            head = head.next;
        }
        System.out.println("null");

    }
}

class Solution {
    public Node copyRandomList(Node head) {
        Node res = new Node(-101);
        Node aRes = res;
        Node pass = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (pass!=null) {
            aRes.next = new Node(pass.val);
            aRes = aRes.next;
            map.put(pass, aRes);
            pass = pass.next;
        }
        Node lass = head;
        Node bRes = res.next;
        while (lass != null) {
            Node rand = lass.random == null ? null : map.get(lass.random);
            bRes.random = rand;
            lass = lass.next;
            bRes = bRes.next;
        }
        Node.print(res.next);
        return res.next;
    }
}

public class CopyRandomList {
    public static void main(String[] args) {
        Solution x = new Solution();
        // Node a1 = new Node(3);
        // Node a2 = new Node(7);
        // Node a3 = new Node(4);
        // Node a4 = new Node(5);
        // a1.next = a2;
        // a2.next = a3;
        // a3.next = a4;
        // a4.next = null;
        // a1.random = null;
        // a2.random = a4;
        // a3.random = a1;
        // a4.random = a2;
        Node b1 = new Node(3);
        Node b2 = new Node(3);
        Node b3 = new Node(3);
        b1.next = b2;
        b2.next = b3;
        b3.next = null;
        b1.random = null;
        b2.random = b1;
        b3.random = null;
        x.copyRandomList(b1);
    }
}
