import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int f =0;
        int h1[] = new int[n1];
        int h1_count = 0, h2_count = 0, h3_count = 0;
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            h1_count = h1_count+h1[h1_i];
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            h2_count = h2_count+h2[h2_i];
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            h3_count = h3_count+h3[h3_i];
        }
        int i = 0, j = 0, z = 0;
        while(i != n1 && j != n2 && z != n3)
            {
            if(h1_count == h2_count && h2_count == h3_count)
                {
                System.out.println(h1_count);
                f=1;
                break;
            }
            else if(h1_count >= h2_count && h1_count >= h3_count)
                {
                h1_count = h1_count - h1[i];
                h1[i] = 0;
                i++;
            }
             else if(h2_count >= h1_count && h2_count >= h3_count)
                {
                h2_count = h2_count - h2[j];
                h2[j] = 0;
                j++;
            }
            else
                {
                h3_count = h3_count - h3[z];
                h3[z] = 0;
                z++;
            }
        }
        if(f!=1)
        System.out.println("0");
    }
}
