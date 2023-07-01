import java.util.Collections;
import java.util.PriorityQueue;

public class kthsmallest {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k = 3;
        int size = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i<size;i++){
            pq.add(arr[i]);
            if(pq.size() > arr.length-k){
                System.out.println(pq.poll());
            }
        }
    }
}