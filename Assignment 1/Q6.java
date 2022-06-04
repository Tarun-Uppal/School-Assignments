import java.util.*;
public class Q6
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = sc.nextInt();
        String s = "";
        while(n>0){
            s +=""+(n%2);
            n /= 2;
        }
        System.out.println("Binary: " + s);
    }
}
