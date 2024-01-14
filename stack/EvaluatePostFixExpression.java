package stack;

import java.util.Stack;

public class EvaluatePostFixExpression {

//35*62/+4-

    public static int evaulatePostFix(String exp){

        Stack<Integer> stack=new Stack<>();

        for (char c:exp.toCharArray()
             ) {
            if(Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                stack.push(num);
            }
            else{
                //it is operator
                int temp=0;

                int second=stack.pop();

                int first=stack.pop();

                switch (c){

                    case '+':
                        temp = first + second;
                        break;
                    case '-':
                        temp = first - second;
                        break;
                    case '*':
                        temp = first * second;
                        break;
                    case '/':
                        temp = first / second;
                        break;
                }
                stack.push(temp);
            }
        }

        return stack.pop();
    }


    public static void main(String[] args) {

        String exp="35*62/+4-";
        System.out.println(evaulatePostFix(exp));

        System.out.println(6+5+3*4); //34*

        System.out.println(evaulatePostFix("65+34*+"));

        System.out.println(evaulatePostFix("234*+82/-"));
    }

}
