import java.util.Stack;

public class validpara {
    public static void main(String[] args) {
        String s = "()";
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            st.push(s.charAt(i));
        }
        System.out.println(st.toString());
        while(!st.isEmpty()){
            char temp1 = st.pop();
            char temp2 = st.pop();
            if(temp1!=temp2){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }

}
