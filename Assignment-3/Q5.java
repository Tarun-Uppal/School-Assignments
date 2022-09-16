import java.util.*;
public class Q5
{
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[10];
    int sum = 0;
    public static void main(){
        Q5 q5 = new Q5();
        q5.accept();
        q5.calculate();
        q5.print();
    }

    void accept(){
        for(int i  =0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
    }

    void calculate(){
        for(int i  =0; i < 10; i++){
            if (arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
    }

    void print(){
        System.out.println(sum);
    }
}
