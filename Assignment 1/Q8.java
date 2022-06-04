import java.util.*;
public class Q8
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1;i<n;i++){
            if (n%i == 0){
                s+= i;
            }
        }
        if (n == s){
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It is not a perfect number");
        }
    }
}
