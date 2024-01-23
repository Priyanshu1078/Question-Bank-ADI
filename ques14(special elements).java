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
        int[][] lsum=new int[n][n];
        int[][] rsum=new int[n][n];
        lsum[0][0]=arr[0];
        for(int i=1;i<n;i++){
            if(i%2==0){
                lsum[i][0]=lsum[i-1][0]+arr[i];
                lsum[i][1]=lsum[i-1][1];
            }else{
                lsum[i][0]=lsum[i-1][0];
                lsum[i][1]=lsum[i-1][1]+arr[i];
            }
        }
        if((n-1)%2==0) rsum[n-1][0]=arr[n-1];
        else rsum[n-1][1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(i%2==0){
                rsum[i][0]=rsum[i+1][0]+arr[i];
                rsum[i][1]=rsum[i+1][1];
            }else{
                rsum[i][0]=rsum[i+1][0];
                rsum[i][1]=rsum[i+1][1]+arr[i];
            }
        }
        int c=0;
        if(rsum[1][0]==rsum[1][1]) c++;
        if(lsum[n-2][0]==lsum[n-2][1]) c++;
        for(int i=1;i<n-1;i++){
            if(lsum[i-1][0]+rsum[i+1][1]==lsum[i-1][1]+rsum[i+1][0]) c++;
        }
        System.out.println(c);
    }
}
