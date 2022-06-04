import java.util.*;
public class Q5
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = sc.nextInt();
        for(int i = 2; i<n;i++){
            if (n == (i*(i+1))){
                System.out.println("Pronic number");
                System.exit(0);
            }
        }
        System.out.println("Not a Pronic number");
    }
}
