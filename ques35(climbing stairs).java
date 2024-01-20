//1st Method (Recursion)
import java.util.Scanner;
public class ques35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sol(n));
    }
    public static int sol(int n){
        if(n==0 || n==1) return 1;
        return sol(n-1)+sol(n-2);
    }
}
//2nd Method (Memoization or Top-Down DP)
import java.util.Scanner;
public class ques35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] memo=new int[n+1];
        System.out.println(sol(n,memo));
    }
    public static int sol(int n,int[] memo){
        if(n==0 || n==1) return 1;
        if(memo[n]!=0) return memo[n];
        return memo[n]=sol(n-1,memo)+sol(n-2,memo);
    }
}
//3rd Method (Bottom-Up DP)
import java.util.Scanner;
public class ques35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++) dp[i]=dp[i-1]+dp[i-2];
        System.out.println(dp[n]);
    }
}
//4th Method (Space Optimized Bottom-Up DP)
import java.util.Scanner;
public class ques35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=1,n2=1;
        for(int i=2;i<=n;i++){
            int t=n2;
            n2=n1+n2;
            n1=t;
        }
        System.out.println(n2);
    }
}
