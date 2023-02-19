package STACKS_QUEUES_1ST_HALF;
import java.util.*;
public class PostfixExpressionEvaluation
{
    /* function which will evaluate value of a  given postfix expression */
    protected  static int evalPostfix(String express)
    {
        Stack<Integer> st = new Stack<>();

        for(int i=0; i < express.length(); i++) /* loop to scan all elements of the expression one by one */
        {
            char ch = express.charAt(i);

            if(Character.isDigit(ch)) /* pushing value into the stack */
                st.push(ch - '0');


            else       /* if the operator comes it will be evaluated */
            {
                int value1 = st.pop();
                int value2 = st.pop();

                switch(ch)
                {
                    case '+':
                        st.push(value2 + value1);
                        break;

                    case '-':
                        st.push(value2 - value1);
                        break;

                    case '*':
                        st.push(value2*value1);
                        break;
                    case '/':
                        st.push(value2/value1);
                        break;
                }
            }
        }
        return st.pop();   // result return
    }

    // Driver function
    public static void main(String[] args)
    {
        String express="432*+11-";
        System.out.println("Postfix evaluation of the given expression comes out to be :" +evalPostfix(express));
    }
}
