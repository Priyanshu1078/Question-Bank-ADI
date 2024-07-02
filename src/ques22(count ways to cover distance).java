//ist Method (Recursion)
import java.util.Scanner;
public class ques22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sol(n));
    }
    public static int sol(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        return sol(n-1)+sol(n-2)+sol(n-3);
    }
}
//2nd Method (Memoization or Top-Down DP)
import java.util.Scanner;
public class ques22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] memo=new Integer[n+1];
        System.out.println(sol(n,memo));
    }
    public static int sol(int n,Integer[] memo){
        if(n==0) return 1;
        if(n<0) return 0;
        if(memo[n]!=null) return memo[n];
        return memo[n]=sol(n-1,memo)+sol(n-2,memo)+sol(n-3,memo);
    }
}
//3rd Method (Bottom-Up DP)
import java.util.Scanner;
public class ques22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        System.out.println(dp[n]);
    }
}
