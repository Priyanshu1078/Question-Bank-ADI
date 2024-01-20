import java.util.Scanner;
public class ques28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        if(n<=10){
            System.out.println(n*6);
            return ;
        }
        ans+=60;
        n-=10;
        if(n<=20){
            ans+=n*5;
            System.out.println(ans);
            return ;
        }
        ans+=100;
        n-=20;
        if(n<=30){
            ans+=n*4;
        }else ans+=120;
        System.out.println(ans);
    }
}
