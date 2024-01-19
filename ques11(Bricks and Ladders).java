import java.util.*;
public class ques11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); //array size is not given so we are taking input array as String and converting it in Integer Array or you can we sc.hasNext().
        int bricks=sc.nextInt();
        int ladders=sc.nextInt();
        String str[]=s.split(" ");
        int arr[]=new int[str.length];
        for(int i=0;i<arr.length;i++) arr[i]=Integer.parseInt(str[i]);
        System.out.println(sol(arr,bricks,ladders));
    }
    public static int sol(int[] arr, int bricks, int ladders) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]) continue;
            else bricks-=arr[i+1]-arr[i];
            pq.add(arr[i+1]-arr[i]);
            if(bricks<0){
                bricks+=pq.poll();
                if(ladders>0) ladders--;
                else return i;
            }
        }
        return arr.length-1;
    }
}
