import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = new String();
        s = scan.nextLine();
        s = s.toLowerCase();
        HashSet h = new HashSet();
        int i = 0;
        boolean cond = true;
        char c = 'a';
        while((int)c <= (int)'z')
            {
            h.add(c);
            c++;
        }
        //System.out.println(s);
        while(i<s.length())
            {
            
            if(s.charAt(i) != ' ')
                h.remove(s.charAt(i));
            i++;
        }
        if(h.isEmpty())
            System.out.println("pangram");
        else
        {
           // System.out.println(h);
            System.out.println("not pangram");
        }
    }
}