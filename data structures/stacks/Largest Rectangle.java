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
        int[] h = new int[n];
        int[] min = new int[n];
        for(int i =0;i<n;i++)
            {
            h[i] = scan.nextInt();
        }
        
        for(int i = 0;i<n;i++)
            {
            min[i] = 1;
            int j = i+1;
            int z = i-1;
            while(j<n && h[j]>=h[i])
                {
                min[i] = min[i]+1;
                j++;
            }
            while(z>=0 && h[z] >= h[i])
                {
                min[i] = min[i]+1;
                z--;
            }
            min[i] = min[i]*h[i];
            j=0;
        }
        int ans = 0;
        for(int i = 0;i<n;i++)
            {
            if(min[i]>ans)
                ans = min[i];
        }
        System.out.println(ans);
        
    }
}