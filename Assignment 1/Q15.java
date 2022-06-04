import java.util.*;
public class Q15
{
    public static void main(){
        int n1 = 2;
        int n2 = 1;
        System.out.print(n1 + ", " + n2 + ", ");
        for (int i = 1;i<= 8;i++){
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.print(sum + ", ");
        }
    }
}
