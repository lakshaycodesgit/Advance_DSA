import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nextGreatLeft {
    public static void main(String[] args) {
        int[] arr = {1,1 };
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = arr.length-1; i >=0 ; i--) {
           if(s.isEmpty()){
               list.add(arr.length);
           }
           else if(s.size()>0 && arr[s.peek()]<=arr[i]){
               list.add((s.peek()));
           }
           else if(s.size()>0 && arr[s.peek()]>arr[i]){
               while(s.size()>0 && arr[s.peek()]>arr[i]){
                   s.pop();
               }
               list.add(s.size()==0 ? (arr.length) : (s.peek()));
           }
           s.push(i);
        }
        Collections.reverse(list);
        System.out.println(list.toString());

    }
}
