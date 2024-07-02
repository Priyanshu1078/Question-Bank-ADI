import java.util.Scanner;
public class ques15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.next();
        String str[]=s.split(" ");
        int ans=0;
        for(int i=0;i<str.length;i++){
            if(str[i].indexOf(t)!=-1) ans++;
        }
        System.out.println(ans);
    }
}
