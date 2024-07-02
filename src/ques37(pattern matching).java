import java.util.*;
public class ques37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pattern=sc.nextLine();
        String s=sc.nextLine();
        System.out.println(sol(pattern,s));
    }
    public static boolean sol(String pattern, String s) {
        String words[]=s.split(" ");
        char arr[]=pattern.toCharArray();
        if(words.length!=arr.length){
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                if(!map.get(arr[i]).equals(words[i])){
                    return false;
                }
            }else{
                if(set.contains(words[i])) return false;
                map.put(arr[i],words[i]);
            }
            set.add(words[i]);
        }
        return true;
    }
}
