import java.util.*;
public class ques3 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val=val;
        }
    }
    static int idx=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0;i<7;i++) arr[i]=sc.nextInt();
        TreeNode root=create(arr,Integer.MAX_VALUE);
        root=deleteLeaf(root);
        print(root);
    }
    public static TreeNode deleteLeaf(TreeNode root){
        if(root==null || root.left==null && root.right==null) return null;
        root.left=deleteLeaf(root.left);
        root.right=deleteLeaf(root.right);
        return root;
    }
    public static TreeNode create(int[] pre, int max){
        if(idx>=pre.length || pre[idx]>max){
            return null;
        }
        TreeNode root=new TreeNode(pre[idx]);
        idx++;
        root.left=create(pre,root.val);
        root.right=create(pre,max);
        return root;
    }
    public static void print(TreeNode root){
        if(root==null) return ;
        print(root.left);
        print(root.right);
        System.out.print(root.val+" ");
    }
}
