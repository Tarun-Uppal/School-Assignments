import java.util.*;
public class Q7d
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        for (int i = 1;i <= 6; i++){
            for (int j = 1; j<=((6-i)); j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
