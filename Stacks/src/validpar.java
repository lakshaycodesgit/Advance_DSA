import java.util.Stack;

public class validpar {
    public static void main(String[] args) {
        String s = "{[()]}";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length()/2; i++) {
            stack.push(s.charAt(i));
        }
        for (int j = (s.length()/2) ; j < s.length(); j++) {
            if(stack.pop() == s.charAt(j)){
               System.out.println(true);
            }
            else
                System.out.println(false);
        }
    }
}
