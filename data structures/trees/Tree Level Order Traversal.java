   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
      if(root == null)
          return;
       else
           {
           Node temp = root;
           Queue queue = new LinkedList();
           queue.add(temp);
           while(!queue.isEmpty())
               {
               temp = (Node)queue.remove();
               System.out.print(temp.data+" ");
               if(temp.left != null)
               queue.add(temp.left);
               if(temp.right != null)
               queue.add(temp.right);
           }
       }
      
    }
