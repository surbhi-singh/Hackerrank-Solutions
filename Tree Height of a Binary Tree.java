   /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
    {
         if((root == null) || (root.left == null && root.right == null))
             return 0;
       else
           {
           return (1+ Math.max(height(root.left), height(root.right)));
       }
    }
