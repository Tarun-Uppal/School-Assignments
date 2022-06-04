import java.util.*;
public class Q3
{
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();
        Q3 q3 = new Q3();
        int res = q3.armstrong(n);
        if (res == 1){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
    
    int armstrong(int n){
        int sum = 0;
        int temp = n;
        for (int i = 0;temp>0;i++){
            sum+= Math.pow((temp%10) , 3);
            temp/=10;
        }
        if (n == sum)
            return 1;
        return 0;
    }
}