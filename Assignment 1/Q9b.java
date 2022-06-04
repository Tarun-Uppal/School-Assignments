import java.util.*;
public class Q9b
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = sc.nextInt();
        double s = 0;
        int numerator = 1;
        int denominator = 1;
        for (int i = 1; i<=n;i++){
            s += (double)numerator/denominator;
            numerator+=2;
            denominator+=1;
        }
        System.out.println(s);
    }
}
