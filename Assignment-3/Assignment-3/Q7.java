import java.util.*;
public class Q7
{
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[10];
    public static void main(){
        Q7 q7 = new Q7();
        q7.accept();
        q7.print();
    }

    void accept(){
        for(int i  =0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
    }

    void print(){
        for(int i  = 0; i < 10; i++){
            int num = arr[i];
            boolean isprime = true;
            for (int j = 2; j < num;j++){
                if (num % j == 0){
                    isprime = false;
                }
            }
            if (isprime){
                System.out.print(num + ", ");
            }
        }
    }
}