/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    int c=0;
    if(headA == null)
        return headB;
    else if(headB == null)
        return headA;
        else
        {
        
        Node ptrA = headA;
        Node ptrB = headB;
        while(ptrA != null && ptrB != null)
            {
            if(ptrA.data < ptrB.data)
                {
                Node t = ptrA;
                if(c==0)
                c=1;
                
               while((ptrA != null) && (ptrA.data < ptrB.data))
                   {
                   
                   t = ptrA;
                   ptrA=ptrA.next;
                   
               }
                
                t.next = ptrB;
                
            }
            else
                {
                if(c==0)
                    c=2;
                Node t = ptrB;
                while((ptrB != null) && (ptrA.data >= ptrB.data))
                   {
                    t = ptrB;
                   ptrB=ptrB.next;
               }
                //Node t = ptrB.next;
                t.next = ptrA;
               // ptrB = t;
            }
        }
        
        if(c==1)
            {
        return headA;    
        }
        
        else 
        {
            return headB;
        }
    }

}
