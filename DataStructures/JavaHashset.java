/**
 *HackerRank Challenge
 *
 *Input will take the number of name pairs.
 *To output the number of unique pairs at that point of input.
 *
 *@author Arihant Jain
 *
*/

import java.util.*;

public class JavaHashset {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> h = new HashSet<String>();
        for(int i=0; i<pair_left.length; i++){
        	h.add(pair_left[i]+" "+pair_right[i]);
        	System.out.println(h.size());
        }
    }
}
