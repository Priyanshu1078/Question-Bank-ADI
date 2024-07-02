//1st Method(Recursion)
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        int w=sc.nextInt();
        System.out.println(sol(arr,w,0));
    }
    public static int sol(int[][] arr,int w,int idx){
        if(idx==arr.length) return 0;
        int ans=0;
        if(w>=arr[idx][0]){
            ans=sol(arr,w-arr[idx][0],idx+1)+arr[idx][1];
        }
        ans=Math.max(ans,sol(arr,w,idx+1));
        return ans;
    }
}
//2nd Method(Memoization or Top-down DP)
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        int w=sc.nextInt();
        Integer[][] memo=new Integer[n][w+1];
        System.out.println(sol(arr,w,0,memo));
    }
    public static int sol(int[][] arr,int w,int idx,Integer[][] memo){
        if(idx==arr.length) return 0;
        if(memo[idx][w]!=null) return memo[idx][w];
        int ans=0;
        if(w>=arr[idx][0]){
            ans=sol(arr,w-arr[idx][0],idx+1,memo)+arr[idx][1];
        }
        ans=Math.max(ans,sol(arr,w,idx+1,memo));
        return memo[idx][w]=ans;
    }
}
//3rd Method(Bottom Up DP)
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        int w=sc.nextInt();
        int[][] dp=new int[n+1][w+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(arr[i-1][0]<=j){
                    dp[i][j]=Math.max(arr[i-1][1]+dp[i-1][j-arr[i-1][0]],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}
