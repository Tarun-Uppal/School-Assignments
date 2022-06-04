import java.util.*;
public class Q9a
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter x: ");
        int x = sc.nextInt();
        System.out.print("Please enter n: ");
        int n = sc.nextInt();
        double s = 0;
        int var = 5;
        for (int i = 1; i<=n;i++){
            s += (double)x/var;
            var+=3;
        }
        System.out.println(s);
    }
}
