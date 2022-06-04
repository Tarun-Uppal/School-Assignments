import java.util.*;
public class Q4
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Please enter n2: ");
        int n2 = sc.nextInt();
        boolean val = true;
        
        if ((n1 - n2) == 2 || (n2 - n1) == 2){
            for(int i = 2; (i < n1 && i < n2);i++){
                if (n1 % i == 0 || n2 % i == 0){
                    val = true;
                    break;
                }
                val = false;
            }
        }
               
        if (!val){
            System.out.println(n1 + " and " + n2 + " are twin-prime");
        } else {
            System.out.print(n1 + " and " + n2 + " are not twin-prime");
        }
    }
}
