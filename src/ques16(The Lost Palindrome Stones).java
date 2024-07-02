import java.util.*;
public class ques16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+2;j<s.length();j++){
                if(isPali(s,i,j)){
                    list.add(s.substring(i,j+1)+" "+i+"-"+j);
                }
            }
        }
        if(list.size()==0){
            System.out.println("No Palindrome string found");
            return ;
        }
        //not sure but by looking at output i think we have to print string in sorted order according to length
        Collections.sort(list,(a,b) -> a.length()-b.length());
        for(String i:list) System.out.println(i);
    }
    public static boolean isPali(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
}
