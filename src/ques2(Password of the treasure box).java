import java.util.*;
public class ques2 {
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
    public static class AVL{
        TreeNode root;
        TreeNode rotateLeft(TreeNode root){
            TreeNode nn = root.right;
            TreeNode temp = nn.left;
            nn.left = root;
            root.right = temp;
            root.h=Math.max(root.left.h,root.right.h)+1;
            nn.h=Math.max(nn.left.h,nn.right.h)+1;
            return nn;
        }
        TreeNode rotateRight(TreeNode root){
            TreeNode nn = root.left;
            TreeNode temp = root.right;
            nn.right = root;
            root.left = temp;
            root.h=Math.max(root.left.h,root.right.h)+1;
            nn.h=Math.max(nn.left.h,nn.right.h)+1;
            return nn;
        }
        TreeNode insert(TreeNode root,int k){
            if(root==null) return new TreeNode(k);
            if(root.val>k){
                root.left=insert(root.left,k);
            }else if(root.val<k){
                root.right=insert(root.right,k);
            }else{
                return root;
            }
            int lh=0,rh=0;
            if(root.left!=null) lh=root.left.h;
            if(root.right!=null) rh=root.right.h;
            int bal=lh-rh;
            if(bal>1 && k<root.left.val){
                return rotateRight(root);
            }
            if(bal<-1 && k>root.right.val){
                return rotateLeft(root);
            }
            if(bal>1 && k>root.left.val){
                root.left=rotateLeft(root);
                return rotateRight(root);
            }
            if(bal<-1 && k<root.right.val){
                root.right=rotateRight(root);
                return rotateLeft(root);
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        AVL tree=new AVL();
        for(int i=0;i<n;i++){
            tree.root=tree.insert(tree.root,arr[i]);
        }
        print(tree.root);
    }
    public static void print(TreeNode root){
        if(root==null) return ;
        System.out.print(root.val+" ");
        print(root.left);
        print(root.right);
    }
}
