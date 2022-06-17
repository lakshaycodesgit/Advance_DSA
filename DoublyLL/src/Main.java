public class Main {
    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(0);
        list.insertLast(-1);
        list.insert(100,2);
        list.insert(101,2);
        list.display();
        list.displayrev();
    }
}
