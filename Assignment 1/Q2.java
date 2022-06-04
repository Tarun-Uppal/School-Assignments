import java.util.*;
public class Q2
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = sc.nextInt();
        int s = 0;
        int dig_count = 0;
        int temp = n;
        for (int i = 0; n>0;i++){
            dig_count++;
            n/= 10;
        }
        n = temp;
        for (int i = 0; n>0; i++){
            s += Math.pow(n%10, (dig_count-i));
            n /= 10;
            
        }
        if (s == temp){
            System.out.println("It is a Disarium Number");
        }else {
            System.out.println("It is not a Disarium Number");
        }
            
    }
}
