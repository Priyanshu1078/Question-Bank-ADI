import java.util.*;
public class ques46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<=n;i++){
            ans.add(sol(i));
        }
        System.out.println(ans);
    }
    public static int sol(int n){
        if(n==0) return 0;
        return (n&1)+sol(n>>>1);
    }
}
