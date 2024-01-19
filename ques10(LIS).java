//1st Method (Memoization or Top-Down DP)
import java.util.*;
public class ques10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        Integer[][] memo=new Integer[n][n+1];
        System.out.println(sol(arr,0,-1,memo));
    }
    public static int sol(int[] arr,int idx,int prev,Integer[][] memo){
        if(idx==arr.length) return 0;
        if(memo[idx][prev+1]!=null) return memo[idx][prev+1];
        int ans=0;
        if(prev==-1 || arr[prev]<arr[idx]){
            ans=sol(arr,idx+1,idx,memo)+1;
        }
        ans=Math.max(ans,sol(arr,idx+1,prev,memo));
        return memo[idx][prev+1]=ans;
    }
}
//2nd Method (Bottom-Up DP)
import java.util.*;
public class ques10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int[] dp=new int[n];
        int ans=0;
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    ans=Math.max(ans,dp[i]);
                }
            }
        }
        System.out.println(ans);
    }
}
