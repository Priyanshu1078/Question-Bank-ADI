import java.util.Scanner;
public class ques43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        boolean ans=sol(s,t);
        if(ans) System.out.println("YES");
        else System.out.println("NO");
    }
    public static boolean sol(String s,String t){
        int map1[]=new int[128];
        int map2[]=new int[128];
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        for(int i=0;i<arr1.length;i++){
            if(map1[arr1[i]]!=map2[arr2[i]]){
                return false;
            }
            map1[arr1[i]]=map2[arr2[i]]=i+1;
        }
        return true;
    }
}
