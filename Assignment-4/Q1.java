import java.util.*;
public class Q1
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String imp = sc.nextLine();
        int len = imp.length();
        int count = 0;
        for (int i = 0; i<len ; i++){
            char r = imp.charAt(i);
            if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r== 'u'){
                count++;
            }
        }
        System.out.println("The number of vowels are : " + count);
    }
}
