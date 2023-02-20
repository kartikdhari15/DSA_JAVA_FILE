import java.util.*;
class Solution{
public static int checkRedundancy(String s){
Stack<Character> st = new Stack<>();
for(int i=0; i<s.length(); i++){
char ch = s.charAt(i);
if(ch=='('|| ch=='+'|| ch=='-'|| ch=='*'|| ch=='/'){
st.push(ch);
}
else
{
if(ch==')')
{
char top = st.peek();
if(top == '('){
return 1;
}
else{
while(st.peek() !='('){
st.pop();
}
st.pop();
}
}
}
}
return 0 ;
}
}