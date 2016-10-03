/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
int max(Node root)
    {
    if(root.left == null && root.right == null)
        return root.data;
    else
        {
        return Math.max(Math.max(root.data, max(root.left)), max(root.right));
    }
}
int min(Node root)
    {
    if(root.left == null && root.right == null)
        return root.data;
    else
        {
        return Math.min(Math.min(root.data, min(root.left)), min(root.right));
    }
}

    boolean checkBST(Node root) {
        if(root.left == null && root.right == null)
            return true;
        else
            {
            if((root.data > max(root.left) && root.data < min(root.right)) && checkBST(root.left) && checkBST(root.right))
                {
                return true;
            }
            else
                return false;
        }
        
    }
