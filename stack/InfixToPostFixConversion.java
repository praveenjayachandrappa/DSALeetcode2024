package stack;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostFixConversion {

    public static String convert(String s){

        Stack<Character> stack=new Stack<>();

        StringBuilder sb=new StringBuilder();

        int i=0;

        HashMap<Character,Integer> precedence=new HashMap<>();

        precedence.put('+',1);
        precedence.put('-',1);
        precedence.put('*',2);
        precedence.put('/',2);

        while (i<s.length()){
            char c=s.charAt(i);
            if(isOperand(c)){
                sb.append(c);
                i++;
            }
            else{
                if(stack.isEmpty()){
                    stack.push(c);
                    i++;
                }
               else if(!stack.isEmpty() && precedence.get(c) > precedence.get(stack.peek())) {
                    stack.push(c);
                    i++;
                }
                else{
                    sb.append(stack.pop());
                }
            }
        }

        //copy remaining operators
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    private static boolean isOperand(char c) {

        if(c == '+' || c=='-' || c=='*' || c=='/')
            return false;

        return true;
    }


    public static void main(String[] args) {


        String expression="a+b+c*d"; //this is infix expression convert it to postfix expression

        String postFixExpression = convert(expression);

        System.out.println(postFixExpression);
    }
}
