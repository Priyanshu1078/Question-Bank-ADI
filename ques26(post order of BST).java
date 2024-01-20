import java.util.Scanner;
public class ques26 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    static int idx=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        TreeNode root=sol(null,arr[0]);
        for(int i=1;i<n;i++) root=sol(root,arr[i]);
        print(root);
    }
    public static void print(TreeNode root){
        if(root==null) return ;
        print(root.left);
        print(root.right);
        System.out.print(root.val+" ");
    }
    public static TreeNode sol(TreeNode root,int k){
        if(root==null) return new TreeNode(k);
        if(root.val>k) root.left=sol(root.left,k);
        else if(root.val<k) root.right=sol(root.right,k);
        return root;
    }
}
