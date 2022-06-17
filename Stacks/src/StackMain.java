import java.util.Arrays;

public class StackMain {
    public static void main(String[] args) throws StackException {
        TwoStack stack = new TwoStack();
        stack.push1(50);
        stack.push1(51);
        stack.push1(52);
        stack.push2(53);
        stack.push2(54);
        stack.push2(55);
        System.out.println(Arrays.toString(TwoStack.arr));

        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());





    }
}
