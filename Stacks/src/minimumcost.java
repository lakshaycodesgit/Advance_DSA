import java.util.Scanner;
import java.util.Stack;

public class minimumcost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0) {
            String str = scanner.next();
            Stack<Character> s = new Stack<>();
            String ans = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '{') {
                    s.push('{');
                } else if (str.charAt(i) == '}') {
                    if (s.isEmpty()) {
                        ans = ans + '}';
                    } else {
                        s.pop();
                    }
                }
            }
            if (!s.isEmpty() && ans.length() != 0) {
                System.out.println(s.size() / 2 + s.size() % 2 + ans.length() / 2 + ans.length() % 2);
            } else if (s.isEmpty() && ans.length() % 2 == 0) {
                System.out.println(ans.length() / 2);
            } else if (ans.length() == 0 && s.size() % 2 == 0) {
                System.out.println(s.size() / 2);
            } else {
                System.out.println(-1);
            }
            t--;
        }
    }
}
