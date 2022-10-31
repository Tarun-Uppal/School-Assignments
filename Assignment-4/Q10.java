import java.util.*;
public class Q10
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String imp = sc.nextLine();
        int len = imp.length();
        int s = 0;
        for(int i = 0; i<len; i++){
            char r = imp.charAt(i);
            if (r == ' ' || (i == len-1)){
                if (i == len-1){
                    i++;
                }
                String ss = imp.substring(s, i);
                String temp1 = "";
                for (int j = ((i-s)-1); j>=0; j--){
                    temp1 += ss.charAt(j);
                }
                if(temp1.equals(ss)){
                    System.out.print(ss + ", ");
                }
                s = i+1;
            }
        }
    }
}
