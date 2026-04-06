package linkedList.question9;

import java.util.HashMap;

class DoublyLL{
    int key;
    int val;
    DoublyLL prev;
    DoublyLL next;
    DoublyLL() {this.key = -1; this.val = -1;}
    DoublyLL(int key, int val) {this.key = key; this.val = val;}
}

class LRUCache {
    int capacity;
    HashMap<Integer, DoublyLL> map;
    DoublyLL head;
    DoublyLL tail;
    public LRUCache(int capacity) {
        head = new DoublyLL();
        tail = new DoublyLL();
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        // System.out.print("Get Ops ->");
        // printMap(head);
        DoublyLL node;
        if (map.containsKey(key)) {
            node = map.get(key);
            DoublyLL b4 = node.prev;
            DoublyLL af = node.next;
            b4.next = af;
            af.prev = b4;
            DoublyLL dummy = head.next;
            head.next = node;
            node.next = dummy;
            dummy.prev = node;
            node.prev = head;
            return node.val;
        }
        return -1;  

    }
    
    public void put(int key, int value) {
        DoublyLL node;
        if (map.containsKey(key)) {
            node = map.get(key);
            node.val = value;
            DoublyLL b4 = node.prev;
            DoublyLL af = node.next;
            b4.next = af;
            af.prev = b4;
            DoublyLL dummy = head.next;
            head.next = node;
            node.next = dummy;
            dummy.prev = node;
            node.prev = head;
        }else{
            node = new DoublyLL(key, value);
            map.put(key, node);
            DoublyLL dummy = head.next;
            head.next = node;
            node.next = dummy;
            dummy.prev = node;
            node.prev = head;
            capacity--;
            while (capacity < 0) {
                map.remove(tail.prev.key);
                DoublyLL sL = tail.prev.prev;
                tail.prev = sL;
                sL.next = tail;
                capacity++;
            }
        }
        // System.out.print("Put Ops ->");
        // printMap(head);
    }
    public static void printMap(DoublyLL node){
        while (node != null) {
            System.out.print("{" + node.key + "=" + node.val + "} <-> ");
            node = node.next;
        }
        System.out.println("null");
    }
}


// public static void printMap(HashMap<Integer, DoublyLL> map){
//     System.out.print("{");
//     for(int x : map.keySet()){
//         System.out.print(x + "=" + map.get(x).val +", ");
//     }
//     System.out.println("}");
// }

public class LRU {
    public static void main(String[] args) {
        LRUCache os = new LRUCache(2);
        os.put(1, 10);
        os.get(1);
        os.put(2, 20);
        os.put(3, 30);
        os.get(2);
        os.get(1);
        // os.get(4);
        // os.put(4, 40);
        // os.put(3, 50);
        // os.get(4);
        // os.put(1, 10);
    }    
}
