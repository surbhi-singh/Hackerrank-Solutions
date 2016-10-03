 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
    {
    if(root == null)
        {
        Node temp = new Node();
        temp.data = value;
        temp.left = null;
        temp.right = null;
        root = temp;
        return root;
    }
    else
        {
        if(value <= root.data)
            root.left = Insert(root.left, value);
        else
            root.right = Insert(root.right, value);
        return root;
    }

       
    }


