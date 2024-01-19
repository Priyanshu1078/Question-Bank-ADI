//1st Method(Recursion)
import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(sol(mat,0,0));
    }
    public static int sol(int[][] mat,int r,int c){
        if(r==mat.length-1 && c==mat[0].length-1) return mat[r][c];
        if(r>=mat.length || c>=mat[0].length) return Integer.MIN_VALUE;
        return Math.max(sol(mat,r+1,c),sol(mat,r,c+1))+mat[r][c];
    }
}
//2nd Method(Memoization or Top-Down DP)
import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        Integer[][] memo=new Integer[m][n];
        System.out.println(sol(mat,0,0,memo));
    }
    public static int sol(int[][] mat,int r,int c,Integer[][] memo){
        if(r==mat.length-1 && c==mat[0].length-1) return mat[r][c];
        if(r>=mat.length || c>=mat[0].length) return Integer.MIN_VALUE;
        if(memo[r][c]!=null) return memo[r][c];
        return memo[r][c]=Math.max(sol(mat,r+1,c,memo),sol(mat,r,c+1,memo))+mat[r][c];
    }
}
//3rd Method(Bottom-Up DP)
import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int dp[][]=new int[m][n];
        dp[0][0]=mat[0][0];
        for(int i=1;i<m;i++) dp[i][0]=dp[i-1][0]+mat[i][0];
        for(int i=1;i<n;i++) dp[0][i]=dp[0][i-1]+mat[0][i];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+mat[i][j];
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
