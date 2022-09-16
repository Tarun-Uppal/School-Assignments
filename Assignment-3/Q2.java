import java.util.*;
public class Q2
{   
    int arr[] = new int[10];
    public static void main(){
        Q2 q2 = new Q2();
        q2.accept();
        q2.print();
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        for(int i  =0; i < 10; i++){
            arr[9-i] = sc.nextInt();
        }
    }
    void print(){
        for(int i = 0; i <10; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}