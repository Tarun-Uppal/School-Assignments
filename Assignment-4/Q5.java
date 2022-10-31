import java.util.*;
public class Q5
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String imp = sc.nextLine();
        int len = imp.length();
        String ans = imp.charAt(0)+". ";
        boolean val = false;
        for (int i = 0; i<len ; i++){
            char r = imp.charAt(i);
            if (r == ' '){
                if (val == true){
                    ans += imp.substring(i);
                } else {
                    val = true;
                    ans+= imp.charAt(i+1) + ". ";
                }
            }
        }
        System.out.println(ans);
    }
}
