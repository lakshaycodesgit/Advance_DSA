import java.util.Stack;

public class stackSort {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(7);
        s.push(1);
        s.push(4);
        s.push(5);
        s.push(99);
        s.push(8);

        System.out.println(s.toString());
        sortstck(s);
        System.out.println(s.toString());
    }

    private static void sortstck(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int num = s.pop();
        sortstck(s);
        insertt(s,num);
    }

    private static void insertt(Stack<Integer> s, int num) {

        if(s.isEmpty() || (!s.isEmpty() && s.pop() < num)){
            s.push(num);
            return;
        }
        int n = s.pop();
        s.pop();
        insertt(s,num);
        s.push(n);
    }
}
