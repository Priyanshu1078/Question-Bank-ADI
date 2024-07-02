//1st Method (Recursion)
import java.util.Scanner;
public class ques32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int t=sc.nextInt();
        System.out.println(sol(arr,t,0));
    }
    public static int sol(int[] arr,int t,int idx){
        if(t==0) return 1;
        if(idx==arr.length) return 0;
        int ans=sol(arr,t,idx+1);
        if(arr[idx]<=t) ans+=sol(arr,t-arr[idx],idx);
        return ans;
    }
}
//2nd Method (Memoization or Top-Down DP)
import java.util.Scanner;
public class ques32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int t=sc.nextInt();
        Integer[][] memo=new Integer[n][t+1];
        System.out.println(sol(arr,t,0,memo));
    }
    public static int sol(int[] arr,int t,int idx,Integer[][] memo){
        if(t==0) return 1;
        if(idx==arr.length) return 0;
        if(memo[idx][t]!=null) return memo[idx][t];
        int ans=sol(arr,t,idx+1,memo);
        if(arr[idx]<=t) ans+=sol(arr,t-arr[idx],idx,memo);
        return memo[idx][t]=ans;
    }
}
//3rd Method (Bottom-Up DP)
import java.util.Scanner;
public class ques32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int t=sc.nextInt();
        int dp[]=new int[t+1];
        dp[0]=1;
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i];j<=t;j++){
                dp[j]+=dp[j-arr[i]];
            }
        }
        System.out.println(dp[t]);
    }
}
