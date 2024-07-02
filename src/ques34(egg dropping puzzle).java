//(DP+Binary Search)
import java.util.Scanner;
public class ques34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Integer[][] dp=new Integer[k+1][n+1];
        System.out.println(sol(k,n,dp));
    }
    public static int sol(int k,int n,Integer[][] dp){
        if(k==1 || n==0 || n==1) return n;
        if(dp[k][n]!=null) return dp[k][n];
        int l=1,h=n;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            int mid=(l+h)/2;
            int k1=sol(k-1,mid-1,dp);
            int k2=sol(k,n-mid,dp);
            int temp=1+Math.max(k1,k2);
            if(k1<k2) l=mid+1;
            else h=mid-1;
            ans=Math.min(temp,ans);
        }
        return dp[k][n]=ans;
    }
}
//bottom-up
public int sol(int k, int n) {
    int[][] dp=new int[k+1][n+1];
    for(int i=1;i<=n;i++){
        for(int j=1;j<=k;j++){
            dp[j][i]=dp[j-1][i-1]+dp[j][i-1]+1;
            if(dp[j][i]>=n) return i;
        }
    }
    return -1;
}
