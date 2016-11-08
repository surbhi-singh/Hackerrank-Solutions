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
        int lastAns =0;
        ArrayList []list = new ArrayList [n];
      
        for(int i = 0; i<n;i++)
            {
            list[i] = new ArrayList();
        }
        int q = scan.nextInt();
        while(q-- > 0)
            {
            int i = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int j = ((int)(x^lastAns))%n;
            
            if (i == 1)
            {
               
                list[j].add(y);
                
            }
            else if(i==2)
                {
                ArrayList temp = new ArrayList(list[j]);
                int a = y%(temp.size());
                lastAns = (int)temp.get(a);
               
                System.out.println(lastAns);
            }
        }
    }
}