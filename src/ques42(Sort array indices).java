import java.util.*;
public class ques42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(!map.containsKey(arr[i])){
                map.put(arr[i],new ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(map.keySet());
        while(!pq.isEmpty()){
            int x=pq.poll();
            ArrayList<Integer> list=map.get(x);
            for(int i:list) System.out.print(i+" ");
        }
    }
}
