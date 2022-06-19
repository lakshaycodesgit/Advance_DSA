import java.util.Stack;

public class reverseRec {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(7);
        s.push(1);
        s.push(4);
        s.push(5);
        s.push(99);
        s.push(8);

        System.out.println(s.toString());
        recursion(s);
        System.out.println(s.toString());

    }

    private static void recursion(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int ans = s.pop();
        recursion(s);
        insertbottomele(s,0,s.size(),ans);
    }
    private static void insertbottomele(Stack<Integer> s, int i, int size,int item) {
        if(i == size){
            s.push(item);
            return;
        }
        int ans = s.pop();
        insertbottomele(s,++i,size,item);
        s.push(ans);
    }

}
