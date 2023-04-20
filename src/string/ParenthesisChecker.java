package string;

import java.util.Stack;

public class ParenthesisChecker {

    static boolean ispar(String x){
        Stack<Character> st = new Stack<Character>();
        for (char it : x.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{'))
                    continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Parenthesis Checker");

        String s = "([])";
        System.out.println(ispar(s));
    }
}
