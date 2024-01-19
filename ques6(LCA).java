import java.util.*;
public class ques6 {
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
        String s=sc.nextLine();
        int p=sc.nextInt();
        int q=sc.nextInt();
        String str[]=s.split(" ");
        int arr[]=new int[str.length];
        for(int i=0;i<arr.length;i++) arr[i]=Integer.parseInt(str[i]);
        TreeNode root=sol(arr,Integer.MAX_VALUE);
        System.out.println(sol(root,p,q));
    }
    public static int sol(TreeNode root,int p,int q){
        if(root==null) return -1;
        if(root.val==p || root.val==q) return root.val;
        int left=sol(root.left,p,q);
        int right=sol(root.right,p,q);
        if(left!=-1 && right!=-1) return root.val;
        else if(left!=-1) return left;
        return right;
    }
    public static TreeNode sol(int[] pre,int max){
        if(idx>=pre.length || pre[idx]>max){
            return null;
        }
        TreeNode root=new TreeNode(pre[idx]);
        idx++;
        root.left=sol(pre,root.val);
        root.right=sol(pre,max);
        return root;
    }
}
