import java.util.ArrayList;
import java.util.Stack;

public class LargestRectHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int n = heights.length;

        ArrayList<Integer> next = new ArrayList<>();
        next = nextSmaller(heights,n);

        ArrayList<Integer> prev = new ArrayList<>();
        prev = prevSmaller(heights,n);

        int area = 0;

        for(int i = 0; i < n ; i++){
            int l = heights[i];
            int nextele = 0;
            if(next.get(i) == -1){
                nextele=n;
            }
            else
                nextele = next.get(i);

            int b = nextele - prev.get(i) - 1;
            int newArea = l*b;
            area = Math.max(area,newArea);
        }
        System.out.println(area);
    }
    public static ArrayList<Integer> nextSmaller(int[] heights , int n){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        ArrayList<Integer> next = new ArrayList<>(n);
        for(int i = n-1; i>=0;i--){
            int curr = heights[i];
            while((st.peek()!=-1) && (heights[st.peek()] >= curr)){
                st.pop();
            }
            next.add(i,st.peek());
            st.push(i);
        }
        return next;
    }
    public static ArrayList<Integer> prevSmaller(int[] heights , int n){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        ArrayList<Integer> next = new ArrayList<>(n);
        for(int i = 0 ; i < n-1 ;i++){
            int curr = heights[i];
            while((st.peek()!=-1)&& heights[st.peek()] >= curr){
                st.pop();
            }
            next.add(i,st.peek());
            st.push(i);
        }
        return next;
    }

}
