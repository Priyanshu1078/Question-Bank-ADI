import java.util.Scanner;
public class ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s=sc.next();
            if(isValid(s)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    public static boolean isValid(String s){
        String x="Yes";
        if(x.indexOf(s)!=-1) return true;
        for(int i=0;i<s.length();i++){
            if(x.indexOf(s.charAt(i))==-1){
                return false;
            }
        }
        int c=1;
        String a="Yes";
        while(c<=s.length()/a.length()+2){
            if(x.indexOf(s)!=-1) return true;
            x=x+a;
            c++;
        }
        return false;
    }
}
