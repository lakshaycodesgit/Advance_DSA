public class DoubleLL {
    private Node head;
    private Node tail;
    private int size = 0;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        size++;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        if(head==null){
            node.prev=null;
            head=node;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }
    public void insert(int val , int index){
        if(index==0) {
            insertFirst(val);
            return;
        }
        if(index==size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 0 ; i < index-1 ; i++){
            temp=temp.next;
        }
        Node node = new Node(val);
        temp.next.prev = node;
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;

        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " --> ");
            temp=temp.next;
        }
        System.out.print("end");
        System.out.println();
    }
    public void displayrev(){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.value + " --> ");
            temp=temp.prev;
        }
        System.out.println("start");
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
