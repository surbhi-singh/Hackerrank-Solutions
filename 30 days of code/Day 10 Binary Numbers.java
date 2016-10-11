import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0, y=0;
        String str = Integer.toBinaryString(n);
        char[] ch = str.toCharArray();
       
        for(int i = 0;i<ch.length;i++)
            {
            if(ch[i] == '1')
                {
                y++;
            }
            else
                y=0;
            if(y>max)
                max= y;
        }
       
        System.out.println(max);
    }
}
