import java.util.*;
public class ques30 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    static ArrayList<Integer> list;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int t=sc.nextInt();
        TreeNode root=new TreeNode(arr[0]);
        for(int i=1;i<n;i++) root=sol(root,arr[i]);
        list=new ArrayList<>();
        sol(root);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==t){
                System.out.print(list.get(i+1));
                return ;
            }
        }
    }
    public static void sol(TreeNode root){
        if(root==null) return ;
        sol(root.left);
        list.add(root.val);
        sol(root.right);
    }
    public static TreeNode sol(TreeNode root, int k){
        if(root==null) return new TreeNode(k);
        if(root.val>k) root.left=sol(root.left,k);
        else if(root.val<k) root.right=sol(root.right,k);
        return root;
    }
}
