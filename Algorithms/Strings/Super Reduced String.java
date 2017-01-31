import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ArrayList<Character> array = new ArrayList<Character>();
        int j = 0;
        for(int i =0;i<s.length();i++)
            {
            array.add(i,s.charAt(i));
        }
        //array = ArrayUtils.toObject(s.toCharArray());
        //System.out.println(array.size());
        for(int i =1;i < array.size();i++)
            {
            if(array.isEmpty())
                break;
            if(array.get(j) == array.get(i))
                {
                //System.out.println(array.get(j));
                //System.out.println(array.get(i));
                array.remove(j);
                array.remove(j);
                if(j>0)
                j--;
                i = j;
            }
            else
                {
                j=i;
            }
                
            
        }
        if(array.isEmpty())
        System.out.println("Empty String");
        else
            {
            StringBuilder temp = new StringBuilder(array.size());
            for(Character c: array)
                temp.append(c);
             System.out.println(temp);
        }
            
    }
}