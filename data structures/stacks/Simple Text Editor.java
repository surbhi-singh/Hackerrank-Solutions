import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        Stack stack = new Stack();
        stack.push(s.toString());
        int q = scan.nextInt();
       
        while(q-- > 0)
            {
            int choice = scan.nextInt();
            if(choice == 1)
                {
                String w = scan.next();
                s.append(w);
                stack.push(s.toString());
                
                
            }
            else if(choice == 2)
                {
                int k = scan.nextInt();
                int temp = s.length();
                s.delete(temp-k, temp);
                stack.push(s.toString());
                
                
            }
            else if(choice == 3)
                {
                System.out.println(s.charAt(scan.nextInt()-1));
            }
            else
                {
                stack.pop();
                String temp = (String)stack.peek();
                s.delete(0, s.length());
                s.append(temp);
               
            }
        }
    }
}