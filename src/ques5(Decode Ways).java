//1st Method (Memoization or Top-Down DP)
import java.util.Scanner;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Integer[] memo=new Integer[s.length()+1];
        System.out.println(sol(s,memo));
    }
    public static int sol(String s,Integer[] memo){
        int n=s.length();
        if(n==0) return 1;
        if(s.charAt(0)=='0') return 0;
        if(memo[n]!=null) return memo[n];
        int ans=sol(s.substring(1),memo);
        if(s.length()>1){
            if((s.charAt(0)=='1' || s.charAt(0)=='2') && s.charAt(1)<'7'){
                ans+=sol(s.substring(2),memo);
            }
        }
        return memo[n]=ans;
    }
}
//2nd Method (Bottom-Up DP)
import java.util.Scanner;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(s.charAt(i-1)!='0'){
                dp[i]=dp[i-1];
            }
            if(i>1 && (s.charAt(i-2)=='1' || (s.charAt(i-2)=='2' && s.charAt(i-1)<'7'))){
                dp[i]+=dp[i-2];
            }
        }
        System.out.println(dp[n]);
    }
}
