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
        String[] names = new String[n];
        for(int i = 0; i<n;i++)
            {
            names[i] = scan.next();
        }
        int q = scan.nextInt();
        
        for(int i = 0; i< q;i++)
            {
            String check = scan.next();
            
            int count = 0;
            for(int j = 0; j<n;j++)
                {
                if(check.equals(names[j]))
                    count++;
            }
            System.out.println(count);
        }
    }
}