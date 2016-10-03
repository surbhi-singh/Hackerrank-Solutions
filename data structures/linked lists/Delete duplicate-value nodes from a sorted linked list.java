/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    if(head == null)
        return head;
    else
        {
        Node ptr1 = head;
        Node ptr2 = head.next;
        while(ptr2 != null)
            {
            if(ptr1.data == ptr2.data)
                {
                while((ptr2 != null) && (ptr1.data == ptr2.data))
                    {
                    ptr2 = ptr2.next;
                }
                ptr1.next = ptr2;
            }
            if(ptr2 != null)
                {
                ptr1 = ptr1.next;
            ptr2 = ptr2.next;
            }
            
        }
        return head;
    }

}
