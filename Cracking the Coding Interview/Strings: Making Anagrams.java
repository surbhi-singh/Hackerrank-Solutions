import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int length1 = first.length();
        int length2 = second.length();
        int count = 0;
        Map h = new HashMap<Character, Integer>();
        for(int i =0;i<length1;i++)
        {
           int x=0;
           if(h.get(first.charAt(i)) != null)
                x=(int)h.get(first.charAt(i));
          h.put(first.charAt(i), ++x);
        }
        for(int i =0;i<length2;i++)
        {
            int x=0;
            if(h.get(second.charAt(i)) != null)
            {
                x = (int)h.get(second.charAt(i));
                if(x == 0)
                {
                    count++;
                }
                else
                {
                    h.put(second.charAt(i), x-1);
                }
            }
            else
            count++;
        }
        for(Object ch: h.keySet())
        {
            count= count+ (int)h.get(ch);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
