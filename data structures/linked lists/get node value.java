/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
   
        
        Node end = head;
        Node position = head;
        while(--n >= 0)
            {
            end = end.next;
        }
        while(end.next != null)
            {
            end = end.next;
            position = position.next;
        }
        return position.data;
    


}
