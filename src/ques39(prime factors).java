//1st Method
import java.util.Scanner;
public class ques39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sol(n);
    }
    public static void sol(int n){
        if(n==1) return ;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                sol(n/i);
                return;
            }
        }
    }
}
//2nd Method
import java.util.Scanner;
public class ques39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sol(n);
    }
    public static void sol(int n){
        for(int i=2;i<=n;i++){
            while(n!=1 && n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
            if(n==1) return ;
        }
    }
}
