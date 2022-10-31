import java.util.*;
public class Q6
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String imp = sc.nextLine();
        int len = imp.length();
        int s = 0;
        String ans = "";
        for(int i = 0; i<len; i++){
            char r = imp.charAt(i);
            if (r == ' ' || (i == len-1)){
                if (i == len-1){
                    i++;
                }
                String ss = imp.substring(s, i);
                for (int j = ((i-s)-1); j>=0; j--){
                    ans += ss.charAt(j);
                }
                s = i+1;
                ans+= " ";
            }
        }
        System.out.println(ans);
    }
}
