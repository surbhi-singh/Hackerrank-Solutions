/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
    char[] arr = new char[S.length()];
    Node temp = root;
    arr = S.toCharArray();
    for(int i =0; i< S.length();i++)
        {
            if(arr[i] == '0')
                temp = temp.left;
            else
                temp = temp.right;
            
       
        if(temp.left == null && temp.right == null)
        {
            System.out.print(temp.data);
            temp = root;
        }
    }
    

       
    }
