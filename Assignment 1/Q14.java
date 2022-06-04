import java.util.*;
public class Q14
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Please enter n2: ");
        int n2 = sc.nextInt();
        int hcf = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                hcf = i;
        }
        System.out.println("HCF of " + n1 + " and " + n2 + " is = " + hcf);
    }
}
