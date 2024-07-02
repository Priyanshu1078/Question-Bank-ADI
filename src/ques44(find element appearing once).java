//1st Method (Using XOR Bitwise Operator)
import java.util.Scanner;
public class ques44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); //array size is not given so we are taking input array as String and converting it in Integer Array or you can use sc.hasNext().
        String str[]=s.split(" ");
        int n=str.length;
        int arr[]=new int[n];
        int ans=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(str[i]);
            ans^=arr[i];
        }
        System.out.println(ans);
    }
}
//2nd Method (Simple loop)
import java.util.Scanner;
public class ques44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); ////array size is not given so we are taking input array as String and converting it in Integer Array or you can use sc.hasNext().
        String str[]=s.split(" ");
        int n=str.length;
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++) arr[i]=Integer.parseInt(str[i]);
        if(arr[0]!=arr[1]){
            System.out.println(arr[0]);
            return ;
        }
        if(arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]);
            return ;
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                System.out.println(arr[i]);
                return ;
            }
        }
    }
}
