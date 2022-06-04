import java.util.*;
public class Q4
{
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int n = sc.nextInt();
        Q4 q4 = new Q4();
        int res = q4.factorial(n);
        System.out.println(res);
    }
    
    int factorial(int n){
        int sum = 1;
        int temp = n;
        for (int i = 1;temp>0;i++){
            sum*= i;
            temp-=1;
        }
        return sum;
    }
}