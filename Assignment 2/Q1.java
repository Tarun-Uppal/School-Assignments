import java.util.*;
public class Q1
{
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();
        Q1 q1 = new Q1();
        int rev = q1.reverse(n);
        if (rev == n){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    
    int reverse(int n){
        int rev = 0;
        int count = 0;
        int temp = n;
        for (int i = 0;temp>0;i++){
            count++;
            temp/=10;
        }
        temp = n;
        for (int i = 1; temp>0;i++){
            rev += (temp%10)*Math.pow(10, (count-i));
            temp/=10;
        }
        return rev;
    }
}