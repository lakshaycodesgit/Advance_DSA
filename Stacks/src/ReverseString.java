import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "abcd";
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        String ans = "";
        for (int j = 0; j < str.length(); j++) {
            ans = ans + s.pop();
        }
        System.out.println(ans);
    }
}
