package 栈;

import java.util.HashMap;
import java.util.Stack;

/**
 * https://leetcode.cn/problems/valid-parentheses/
 */
public class _20_有效的括号 {
    private static HashMap<Character, Character> map = new HashMap<>();

    static {
        // key - value
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
    }

    // 方法一：（leetcode表现比较差）
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) { // 左括号
                stack.push(c);
            } else { // 右括号
                if (stack.isEmpty()) return false;

                if (c !=  map.get(stack.pop())) return false;
            }
        }
        return stack.isEmpty();
    }

    // 方法二：（leetcode表现最好）
    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') { // 左括号
                stack.push(c);
            } else { // 右括号
                if (stack.isEmpty()) return false;

                char left = stack.pop();
                if (c == '}' && left != '{') return false;
                if (c == ']' && left != '[') return false;
                if (c == ')' && left != '(') return false;
            }
        }
        return stack.isEmpty();
    }

    // 方法三：（新手容易想，但是运行起来太浪费时间和内存，leetcode表现最差劲，有时候直接超出时间限制）
    public boolean isValid3(String s) {
        while (s.contains("{}") || s.contains("[]") || s.contains("()")) {
            s.replace("{}", "");
            s.replace("[]", "");
            s.replace("()", "");
        }
        return s.isEmpty();
    }
}
