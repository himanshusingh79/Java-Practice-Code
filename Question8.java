package Collection.Lists;

import java.util.Stack;

public class Question8 {
    static boolean isBalanced(String input) {
        Stack<Character> stk = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stk.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stk.isEmpty())
                    return false;

                char top = stk.pop();

                if ((c == '(' && top != ')') || (c == '{' && top != '}') || (c == '[' && top != ']'))
                    return false;
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {

        String pattern1 = "{([])}";
        System.out.println("Is balanced : " + isBalanced(pattern1));

        String pattern2 = "[{(}]";
        System.out.println("Is balanced : " + isBalanced(pattern2));
    }

}
