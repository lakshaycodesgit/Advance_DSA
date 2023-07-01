import java.util.TreeSet;

public class Ceiling {
    public static void main(String[] args) {
        System.out.println(-1);
        TreeSet<Integer> s = new TreeSet<>();
        int[] arr = {2,8,30,15,25,12};
        s.add(arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            Integer test = s.ceiling(arr[i]);
            if(test!=null){
                System.out.println(s.ceiling(arr[i]));
            }
            else
                System.out.println(-1);
            s.add(arr[i]);
        }
    }
}
