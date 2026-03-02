/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head == null) return null ;

        HashMap<Node,Node> map = new HashMap<>() ;
        Node newHead = new Node(head.val) ;
        Node t1 = head ;
        Node t2 = newHead ;
        map.put(t1,t2);

         while(t1.next!=null){
            t1=t1.next;
            t2.next = new Node(t1.val);
            t2 = t2.next;
            map.put(t1,t2);
        }

         t1 = head;
         t2 = newHead;

        while(t1!=null){
            t2.random = map.get(t1.random);
            t1=t1.next;
            t2=t2.next;
        } 
        return newHead;
        
    }
}