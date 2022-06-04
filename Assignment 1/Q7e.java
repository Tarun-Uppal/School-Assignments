import java.util.*;
public class Q7e
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        for (int i = 1;i < 12; i+=2){
            for (int j = 1; j<=((12-i)); j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
