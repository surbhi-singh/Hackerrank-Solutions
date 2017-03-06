import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();
        String[] mag = magazine.split(" ");
        
        for(String s: mag)
            {
            if(magazineMap.get(s) == null)
                {
                magazineMap.put(s, 0);
            }
            else
                {
                int temp = magazineMap.get(s);
                magazineMap.put(s, temp+1);
            }     
        }
        String[] tempNote = note.split(" ");
        for(String s: tempNote)
            {
            if(noteMap.get(s) == null)
                {
                noteMap.put(s, 0);
            }
            else
                {
                int temp = noteMap.get(s);
                noteMap.put(s, temp+1);
            }     
        }
        
    }
    
    public boolean solve() {
        for(String s: noteMap.keySet())
            {
            int num = noteMap.get(s);
            if(magazineMap.get(s) < num)
                return false;
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
