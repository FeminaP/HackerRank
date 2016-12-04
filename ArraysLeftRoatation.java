//https://www.hackerrank.com/challenges/ctci-array-left-rotation

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int ret[] = new int[n];
        int inc = 0;
        for(int i=k; i<n; i++){
            ret[inc] = a[i];
            inc++;
        }
        for(int j=0; j<k; j++){
            ret[inc] = a[j];
            inc++;
        }
        for(int l=0; l < n; l++){
            System.out.print(ret[l]+" ");
        }
    }
}
