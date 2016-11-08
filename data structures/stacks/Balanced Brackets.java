import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            char[] ch = s.toCharArray();
            Stack stack = new Stack();
            int i;
            for(i = 0; i < ch.length; i++)
                {
                if(ch[i] == '{' || ch[i] == '[' || ch[i] == '(')
                    stack.push(ch[i]);
                else 
                {
                    if(stack.isEmpty())
                        {
                        System.out.println("NO");
                        break;
                    }
                    else if(ch[i] == ')')
                        {
                        char temp = (char)stack.pop();
                        if(temp != '(')
                            {
                            System.out.println("NO");
                        break;
                        }
                    }
                    else if(ch[i] == '}')
                        {
                        char temp = (char)stack.pop();
                        if(temp != '{')
                            {
                            System.out.println("NO");
                        break;
                        }
                    }
                    else if(ch[i] == ']')
                        {
                        char temp = (char)stack.pop();
                        if(temp != '[')
                            {
                            System.out.println("NO");
                        break;
                        }
                    }
                        
                }
            }
            if(i == ch.length && stack.isEmpty())
                System.out.println("YES");
            else if(i==ch.length && !stack.isEmpty())
                System.out.println("NO");
        }
    }
}
