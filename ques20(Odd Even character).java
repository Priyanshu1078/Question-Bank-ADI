import java.util.Scanner;
public class ques20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            int n=(int)s.charAt(i);
            if(i%2==0) n++;
            else n--;
            System.out.print((char)n);
        }
    }
}
