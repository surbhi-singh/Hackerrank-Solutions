/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
  if(root == null)
      return;
    Node temp = root;
    Stack stack = new Stack();
    while(temp != null)
        {
        stack.push(temp.data);
        temp = temp.left;
    }
    while(!stack.isEmpty())
        System.out.print(stack.pop()+ " ");
    temp = root.right;
    while(temp != null)
        {
        System.out.print(temp.data+ " ");
        temp = temp.right;
       
    }
   
    
    
}
