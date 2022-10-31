import java.util.*;
public class Q2
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String imp = sc.nextLine();
        int len = imp.length();
        imp = imp.toLowerCase();
        String n = "";
        for(int i = 0;i<len;i++){
            char r = imp.charAt(i);
            if (r == 'e'){
                n+='*';
            } else {
                n += r;
            }
        }
        System.out.println(n);
    }
}