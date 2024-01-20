import java.util.Scanner;
public class ques36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int arr[]=new int[26];
        int max=0;
        char ans='a';
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            arr[idx]++;
            if(arr[idx]>max){
                max=arr[idx];
                ans=s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
