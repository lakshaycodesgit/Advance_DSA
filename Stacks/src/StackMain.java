public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);
        stack.push(50);
        stack.push(51);
        stack.push(52);
        stack.push(53);
        stack.push(54);
        stack.push(55);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());




    }
}
