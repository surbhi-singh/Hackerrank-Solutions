import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack stack = new Stack();
        int max = 0;
        while(n-->0)
            {
            int x = scan.nextInt();
            if(x == 1)
                {
                int element = scan.nextInt(); 
                stack.push(element);
                if(max<element)
                    max = element;
            }
            else if(x == 3)
                System.out.println(max);
            else if(x == 2)
            {
                int element = (int)stack.pop();
                if(max == element)
                    {
                    max = 0;
                    Stack temp_stack = (Stack) stack.clone();
                    while(!temp_stack.isEmpty())
                        {
                        int t = (int)temp_stack.pop();
                        
                        if(max < t)
                            max = t;
                        
                    }
                }
            }
        }
    }
}