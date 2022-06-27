import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LargestRectHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int n = heights.length;

        int[] next = nextSmaller(heights,n);
        System.out.println(Arrays.toString(next));
        int[] prev = prevSmaller(heights,n);
        System.out.println(Arrays.toString(prev));

        int area = 0;

        for(int i = 0; i < n ; i++){
            int l = heights[i];
            if(next[i] == -1){
                next[i]=n;
            }

            int b = next[i] - prev[i] - 1;
            int newArea = l*b;
            area = Math.max(area,newArea);
        }
        System.out.println(area);
    }
    public static int[] nextSmaller(int[] heights , int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i = n-1; i >=0 ; i--) {
            int curr = heights[i];
            while((st.peek()!=-1) && heights[st.peek()]>=curr){
                st.pop();
            }
            ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }
    public static int[] prevSmaller(int[] heights , int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i = 0; i < n ; i++) {
            int curr = heights[i];
            while((st.peek()!=-1) && heights[st.peek()]>=curr){
                st.pop();
            }
            ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }

}
