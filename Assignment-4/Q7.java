import java.util.*;
public class Q7
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String imp = sc.nextLine();
        int len = imp.length();
        int count = 0;
        for (int i = 0; i<len ; i++){
            for(int j = 0;j<len-i;j++){
                System.out.print(imp.charAt(j)+" ");
            }
            System.out.println();
        }
        
    }
}
