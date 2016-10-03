/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    HashMap<Node, Node> hashmap = new HashMap<Node, Node>();
    Node ptr1 = headA;
    Node ptr2 = headB;
    while(ptr1 != null || ptr2 != null)
        {
        if(ptr1 != null)
            {
            if(hashmap.containsKey(ptr1))
                return ptr1.data;
            else
                hashmap.put(ptr1, ptr1.next);
            ptr1 = ptr1.next;
        }
        else if(ptr2 != null)
            {
            if(hashmap.containsKey(ptr2))
                return ptr2.data;
            else
                hashmap.put(ptr2, ptr2.next);
            ptr2 = ptr2.next;    
        }
        
        
    }
return 1;
}
