/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head == null)
        return false;
    else
        {
        HashMap<Node, Node> hashmap = new HashMap<Node, Node>();
        Node ptr = head;
        while(ptr != null)
            {
            if(hashmap.containsKey(ptr.next))
                return true;
            else
                {
                hashmap.put(ptr, ptr.next);
            }
            ptr = ptr.next;
        }
        return false;
    }

}
