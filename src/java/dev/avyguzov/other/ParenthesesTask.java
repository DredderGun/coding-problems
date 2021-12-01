package dev.avyguzov.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class ParenthesesTask {
     public boolean solution(String brackets) {
          List<Character> openParentheses = new ArrayList<>(Arrays.asList('{', '[', '('));
          Stack<Character> parenthesesStack = new Stack<>();

          for (int i = 0; i < brackets.length(); i++) {
               char currBracket = brackets.charAt(i);
               if (openParentheses.contains(currBracket)) {
                    parenthesesStack.push(currBracket);
               } else if (parenthesesStack.size() == 0) {
                    return false;
               } else if (parenthesesStack.peek() == '{' && currBracket == '}') {
                    parenthesesStack.pop();
               } else if (parenthesesStack.peek() == '[' && currBracket == ']') {
                    parenthesesStack.pop();
               } else if (parenthesesStack.peek() == '(' && currBracket == ')') {
                    parenthesesStack.pop();
               } else {
                    return false;
               }
          }

          return parenthesesStack.size() == 0;
     }
}
