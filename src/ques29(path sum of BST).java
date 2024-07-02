import java.util.Scanner;
public class ques29 {
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
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int t=sc.nextInt();
        TreeNode root=new TreeNode(arr[0]);
        for(int i=1;i<n;i++) root=sol(root,arr[i]);
        System.out.println(sol(root,t,0));
    }
    public static boolean sol(TreeNode root,int t,int s){
        if(root==null) return t==s;
        return sol(root.left,t,s+root.val) || sol(root.right,t,s+root.val);
    }
    public static TreeNode sol(TreeNode root,int k){
        if(root==null) return new TreeNode(k);
        if(root.val>k) root.left=sol(root.left,k);
        else if(root.val<k) root.right=sol(root.right,k);
        return root;
    }
}
