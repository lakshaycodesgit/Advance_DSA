import java.util.Arrays;
import java.util.Stack;

public class MidOfStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.toString());
        removemid(s,0,s.size());
        System.out.println(s.toString());

    }

    private static void removemid(Stack<Integer> s, int i, int size) {
        if(i == size/2){
            s.pop();
            return;
        }
        int ans = s.pop();
        removemid(s,++i,size);
        s.push(ans);
    }
}
