import java.util.*;
public class ques33 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static class Pair{
        int val;
        int level;
        Pair(int val,int level){
            this.val=val;
            this.level=level;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            int x=sc.nextInt();
        }
        TreeNode root=new TreeNode(arr[0]);
        for(int i=1;i<n;i++) root=sol(root,arr[i]);
        HashMap<Integer,Pair> map=new HashMap<>();
        sol(root,map,0,0);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.addAll(map.keySet());
        while(!pq.isEmpty()){
            int x=pq.poll();
            System.out.print(map.get(x).val+" ");
        }
    }
    public static void sol(Node root,HashMap<Integer,Pair> map,int x,int y){
        if(root==null) return ;
        if(!map.containsKey(x) || map.get(x).level>y){
            map.put(x,new Pair(root.data,y));
        }
        sol(root.left,map,x-1,y+1);
        sol(root.right,map,x+1,y+1);
    }
    public static TreeNode sol(TreeNode root, int k){
        if(root==null) return new TreeNode(k);
        if(root.val>k) root.left=sol(root.left,k);
        else if(root.val<k) root.right=sol(root.right,k);
        return root;
    }
}
