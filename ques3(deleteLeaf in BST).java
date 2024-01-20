import java.util.*;
public class ques3 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0;i<7;i++) arr[i]=sc.nextInt();
        TreeNode root=sol(null,arr[0]);
        for(int i=1;i<7;i++) root=sol(root,arr[i]);
        root=deleteLeaf(root);
        print(root);
    }
    public static TreeNode deleteLeaf(TreeNode root){
        if(root==null || root.left==null && root.right==null) return null;
        root.left=deleteLeaf(root.left);
        root.right=deleteLeaf(root.right);
        return root;
    }
    public static TreeNode sol(TreeNode root, int k){
        if(root==null) return new TreeNode(k);
        if(root.val>k) root.left=sol(root.left,k);
        else if(root.val<k) root.right=sol(root.right,k);
        return root;
    }
    public static void print(TreeNode root){
        if(root==null) return ;
        print(root.left);
        print(root.right);
        System.out.print(root.val+" ");
    }
}
