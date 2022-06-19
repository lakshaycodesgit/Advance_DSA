import java.util.Arrays;
import java.util.Stack;

public class insertbottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(7);
        s.push(1);
        s.push(4);
        s.push(5);
        System.out.println(s.toString());
        removemid(s,0,s.size(),9);
        System.out.println(s.toString());

    }

    private static void removemid(Stack<Integer> s, int i, int size,int item) {
        if(i == size){
            s.push(item);
            return;
        }
        int ans = s.pop();
        removemid(s,++i,size,item);
        s.push(ans);
    }
}
