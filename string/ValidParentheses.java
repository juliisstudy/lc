package string;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s){
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i<s.length();i++){
            char c= s.charAt(i);
            if(map.containsKey(c)){
                if(stack.empty()||stack.pop()!=map.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
