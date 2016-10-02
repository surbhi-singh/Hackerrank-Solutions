/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    if(head == null)
        return head;
    else
        {
        Node ptr = head;
        
        while(ptr != null)
            {
            Node temp = ptr.next;
            ptr.next = ptr.prev;
            ptr.prev = temp;
            
            if(ptr.prev == null)
                break;
            ptr = ptr.prev;
        }
        head = ptr;
        return head;
    }

}
