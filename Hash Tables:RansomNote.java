/*
Given the words in the magazine and the words in the ransom note, print Yes if he can replicate 
his ransom note exactly using whole words from the magazine; otherwise, print No.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        
        for(int i = 0; i<m; i++){
            String key = magazine[i];
            if(h.containsKey(key)){
                h.put(key,h.get(key) + 1);
            }
            else
                h.put(key,1);
        }
        for(int j = 0; j<n; j++){
            String key = ransom[j];
            if(h.containsKey(key)){
                h.put(key,h.get(key) - 1);
            }
            else
                h.put(key,-1);
        }
        boolean yes = true;
        for(int k = 0; k<n; k++){
            String key = ransom[k];
            if(h.get(key) < 0){
                System.out.print("No");
                yes = false;
                break;
            }
        }
        if(yes)
            System.out.print("Yes");           
    }
}
