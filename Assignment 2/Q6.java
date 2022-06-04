import java.util.*;
public class Q6
{
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperature in Celsius: ");
        int c = sc.nextInt();
        Q6 q6 = new Q6();
        int f = q6.ctof(c);
        System.out.println("Temperature in Fahrenheit: " + f);
    }
    int ctof(int c){
        return (9*(c/5))+32;
    }
}
