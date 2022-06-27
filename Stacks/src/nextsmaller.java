import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nextsmaller {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i <=arr.length-1 ; i++) {
            if(s.isEmpty()){
                list.add(-1);
            }
            else if(s.size()>0 && arr[s.peek()]<=arr[i]){
                list.add(s.peek());
            }
            else if(s.size()>0 && arr[s.peek()]>arr[i]){
                while(s.size()>0 && arr[s.peek()]>arr[i]){
                    s.pop();
                }
                list.add(s.size()==0 ? -1 : s.peek());
            }
            s.push(i);
        }
        System.out.println(list.toString());
    }
}
