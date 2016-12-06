import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i< expression.length(); i++){
            char bracket = expression.charAt(i);
            char check;
            if(bracket == '{' || bracket == '(' || bracket == '[')
                stack.push(bracket);
            else{
                if(!stack.isEmpty())
                    check = stack.pop();
                else
                    return false;
                if((bracket == '}' && check != '{') || (bracket == ')' && check != '(') || (bracket == ']' && check != '['))
                    return false;
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
