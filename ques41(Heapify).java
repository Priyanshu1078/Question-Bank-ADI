import java.util.*;
import java.util.PriorityQueue;
public class ques41 {
    public static class myQueue extends PriorityQueue {
        public void print() {
            for (Object i : this) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        myQueue pq=new myQueue();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            pq.add(x);
        }
        pq.print();
    }
}
