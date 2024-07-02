import java.util.*;

public class ques47 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static List<List<Integer>> level;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        TreeNode root=new TreeNode(arr[0]);
        for(int i=1;i<n;i++) root=insert(root,arr[i]);
        level=new ArrayList<>();
        sol(root,0);
        //for level order traversal
        System.out.println(level);
        //for a particular level(x) just use level.get(x);
        int x=0; //that particular level
        System.out.println(level.get(x));
        //for left view just print 0th index of every level
        System.out.print("Left view of Tree: ");
        for(List<Integer> list:level){
            System.out.print(list.get(0)+" ");
        }
        System.out.println();
        System.out.print("Right view of Tree: ");
        //for right view just print last index of every level
        for(List<Integer> list:level){
            System.out.print(list.get(list.size()-1)+" ");
        }
    }
    public static void sol(TreeNode root,int l){
        if(root==null) return ;
        if(l==level.size()) level.add(new ArrayList<>());
        level.get(l).add(root.val);
        sol(root.left,l+1);
        sol(root.right,l+1);
    }
    public static TreeNode insert(TreeNode root,int val){
        if(root==null) return new TreeNode(val);
        if(val>root.val) root.right=insert(root.right,val);
        else if(val<root.val) root.left=insert(root.left,val);
        return root;
    }
}
