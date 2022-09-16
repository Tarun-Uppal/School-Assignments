import java.util.*;
public class Q1
{
    int arr[] = new int[10];
    int sum = 0;
    public static void main(){
        Q1 q1 = new Q1();
        q1.accept();
        q1.calculate();
        q1.print();
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        for(int i  =0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
    }
    void calculate(){
        for(int i  =0; i < 10; i++){
            sum += arr[i];
        }
    }
    void print(){
        System.out.println(sum);
    }
}