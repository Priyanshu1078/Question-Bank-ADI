import java.util.Scanner;
public class ques7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        for(int i=0;i<s.length()/3;i++){
            if(isValid(s,s.substring(0,i+1))){
                ans=s.substring(0,i+1);
            }
        }
        System.out.println(ans);
    }
    public static boolean isValid(String s,String t){
        int idx=s.indexOf(t);
        if(idx==-1 || idx>0) return false;
        int l=t.length();
        s=s.substring(l);
        idx=s.indexOf(t);
        int x=s.length()-t.length();
        if(idx==-1 && idx!=x) return false;
        idx=s.lastIndexOf(t);
        return idx==x;
    }
}
