import java.util.Scanner;
public class ques27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int i=0,j=0,ans=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                ans++;i++;
            }
            j++;
        }
        System.out.println(ans);
    }
}
