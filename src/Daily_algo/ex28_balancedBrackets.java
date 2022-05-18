package Daily_algo;

import java.util.Stack;

import static Daily_algo.Solution.balancedBrackets;

public class ex28_balancedBrackets {
    public static void main(String[] args) {
        boolean output = balancedBrackets(")");
        System.out.println("output = " + output);
    }
}

class Solution {

    static Stack<Character> s = new Stack<>();
    public static boolean balancedBrackets(String str) {

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '(') s.push('(');
            else if(str.charAt(i) == '[') s.push('[');
            else if(str.charAt(i) == '{') s.push('{');
            else {
                if(s.isEmpty()) return false;
                if (str.charAt(i) == ')') {
                    if (s.peek() == '(') s.pop();
                    else return false;
                } else if (str.charAt(i) == ']') {
                    if (s.peek() =='[') s.pop();
                    else return false;
                } else if (str.charAt(i) == '}') {
                    if (s.peek() == '{') s.pop();
                    else return false;
                }
            }
        }

        if(s.isEmpty()) return true;
        else return false;
    }

}