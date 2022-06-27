import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nStacksinArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            if(s.isEmpty())
                list.add(-1);
            else if(s.size() > 0 && s.peek() > arr[i])
                list.add(s.peek());
            else if(s.size()>0 && s.peek() <= arr[i]){
                while(s.size()>0 && s.peek() <= arr[i]){
                    s.pop();
                }
                list.add(s.isEmpty() ? -1 : s.peek());
            }
            s.push(arr[i]);
        }
        System.out.println(list.toString());
    }
}

