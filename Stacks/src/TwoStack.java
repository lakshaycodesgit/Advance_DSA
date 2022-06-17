public class TwoStack {
    private static final int size = 10;
    private int start1 = -1;
    private int start2 = size;
    public static int[] arr;

    public TwoStack(){
        arr = new int[size];
    }
    public void push1 (int item) throws StackException{
        if((start2-start1) > 1){
            start1++;
            arr[start1]=item;
        }
        else
            throw new StackException("filled filled");
    }
    public void push2 (int item) throws StackException{
        if((start2-start1) > 1){
            start2--;
            arr[start2]=item;
        }
        else
            throw new StackException("filled filled");
    }
    public int pop1() throws StackException{
        int ans = 0;
        if(start1>=0){
            ans = arr[start1--];
        }
        else
            throw new StackException("empty");
        return ans;
    }
    public int pop2() throws StackException{
        int ans = 0;
        if(start2<=size-1){
            ans =  arr[start2++];
        }
        else
            throw new StackException("empty");
        return ans;
    }
}
