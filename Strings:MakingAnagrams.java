/*
Alice is taking a cryptography class and finding anagrams to be very useful. 
We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. 
In other words, both strings must contain the same exact letters in the same exact frequency 
For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character 
deletions required to make the two strings anagrams. Can you help her find this number?
Given two strings a,  and b, that may or may not be of the same length, determine the minimum number of character deletions required 
to make  and  anagrams. Any characters can be deleted from either of the strings.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int numberNeeded(String first, String second) {
      int one = first.length();
      int two = second.length();
      HashMap<Character,Integer> h = new HashMap<Character,Integer>();
      for(int i=0; i<one; i++){
          char key = first.charAt(i);
          if(h.containsKey(key)){
              h.put(key, h.get(key) + 1);
          }
          else
              h.put(key,1);
      }
      for(int i=0; i<two; i++){
          char key = second.charAt(i);
          if(h.containsKey(key)){
              h.put(key, h.get(key) - 1);
          } 
          else
              h.put(key,-1);
      }
      int count = 0;
      List<Integer> list = new ArrayList<Integer>(h.values());
      for(int k=0; k<list.size(); k++){
          if(list.get(k) != 0)
              count = count + Math.abs(list.get(k));
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
