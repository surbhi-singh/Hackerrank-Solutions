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

Node SortedInsert(Node head,int data) {
    if(head == null)
        {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.prev = null;
        head = node;
        return head;
    }
    else
        {
        Node ptr = head;
        while((ptr.next != null) && (ptr.data <= data))
            {
                ptr = ptr.next;
                
            }
        Node node = new Node();
        node.data = data;
        
        if(ptr.data > data)
            {
            Node temp = ptr.prev;
        temp.next = node;
        node.prev = temp;
        node.next = ptr;
        ptr.prev = node;
        }
        else
            {
            ptr.next = node;
            node.prev = ptr;
            node.next = null;
        }
     return head;   
    }
  
}
