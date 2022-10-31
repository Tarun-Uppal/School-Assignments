import java.util.*;
public class Q4
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String imp = sc.nextLine();
        int len = imp.length();
        int cap=0, dig = 0, val = 0;
        for(int i = 0;i<len;i++){
            int s = imp.charAt(i);
            if((s >= 65 && s <= 84) ){
                val +=1;
            } else if (s >= 97 && s <= 121){
                cap +=1;
            } else if (s >= 48 && s <= 57){
                dig+=1;
            }
        }
        System.out.println("Lowercase " + cap);
        System.out.println("Uppercase " + val);
        System.out.println("Digits " + dig);
    }
}
