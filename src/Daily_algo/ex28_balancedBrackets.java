package Daily_algo;

import java.util.Stack;


public class ex28_balancedBrackets {
    public static void main(String[] args) {

        Solution solution = new Solution();
        boolean output = solution.balancedBrackets("([(())]"); // false 리턴, 스택에 '( 가 남아있음

        Solution solution2 = new Solution();
        boolean output2 = solution2.balancedBrackets("("); // false 리턴, 스택에 '(('가 남아있음

        boolean output3= solution2.balancedBrackets("))"); // true 리턴, 남아있던 '(('와 새로운 입력'))'을 처리하며 true로 리턴됨

    }

    public static class Solution {
        static Stack<Character> s = new Stack<>();

        public boolean balancedBrackets(String str) {

            for (int i = 0; i < str.length(); i++) {

                for (Character character : s) {
                    System.out.print(character);
                }
                System.out.println("\n-----");

                if (str.charAt(i) == '(') s.push('(');
                else if (str.charAt(i) == '[') s.push('[');
                else if (str.charAt(i) == '{') s.push('{');
                else {
                    if (s.isEmpty()) return false;
                    if (str.charAt(i) == ')') {
                        if (s.peek() == '(') s.pop();
                        else return false;
                    } else if (str.charAt(i) == ']') {
                        if (s.peek() == '[') s.pop();
                        else return false;
                    } else if (str.charAt(i) == '}') {
                        if (s.peek() == '{') s.pop();
                        else return false;
                    }
                }
            }

            if (s.isEmpty()) return true;
            else return false;
        }

        public static Stack<Character> getStack() {
            return s;
        }
    }
}

