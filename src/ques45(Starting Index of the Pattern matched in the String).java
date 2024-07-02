import java.util.Scanner;
public class ques45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.next();
        s=s.toLowerCase();
        t=t.toLowerCase();
        int ans=s.indexOf(t);
        System.out.println(ans);
    }
}
