import java.util.Scanner;
public class ques14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); //array size is not given so we are taking input array as String and converting it in Integer Array.
        String str[]=s.split(" ");
        int n=str.length;
        if(n==1){
            System.out.println(1);
            return ;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=Integer.parseInt(str[i]);
        int n=arr.length,ans=0,even=0,odd=0;
        for(int i=0;i<n;i++){
            if(i%2==0) even+=arr[i];
            else odd+=arr[i];
        }
        int prev=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even=even-arr[i]+prev;
            }else odd=odd-arr[i]+prev;
            if(even==odd) ans++;
            prev=arr[i];
        }
        System.out.println(ans);
    }
}
