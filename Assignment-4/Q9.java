import java.util.*;
public class Q9
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String imp = sc.next();
        int len = imp.length();
        for(int i = 0;i<len;i++){
            System.out.println("ASCII code of " + imp.charAt(i) + " is: " + ((int)imp.charAt(i)));
        }
    }
}
