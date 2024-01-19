import java.util.*;
public class ques3 {
    public static class TreeNode{
        int val;
        int h;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val=val;
            this.h=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0;i<7;i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        TreeNode root=create(arr,0,6);
        root=deleteLeaf(root);
        print(root);
    }
    public static TreeNode deleteLeaf(TreeNode root){
        if(root==null || root.left==null && root.right==null) return null;
        root.left=deleteLeaf(root.left);
        root.right=deleteLeaf(root.right);
        return root;
    }
    public static TreeNode create(int arr[],int s,int e){
        if(s>e) return null;
        int mid=(s+e)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=create(arr,s,mid-1);
        root.right=create(arr,mid+1,e);
        return root;
    }
    public static void print(TreeNode root){
        if(root==null) return ;
        print(root.left);
        print(root.right);
        System.out.print(root.val+" ");
    }
}
