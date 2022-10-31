import java.util.*;
public class Q3
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String imp = sc.nextLine();
        int len = imp.length();
        String ans ="";
        for(int i = 0;i<len;i++){
            int s = imp.charAt(i);
            if((s>=65 && s<= 84) || (s >= 97 && s <= 121)){
                if (s >= 97){
                    ans+= (char)(s-32);
                }else{
                    ans += (char)(s+32);
                }
            }
        }
        System.out.println(ans);
    }
}
