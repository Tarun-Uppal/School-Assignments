import java.util.*;
public class Q4
{   
    Scanner sc = new Scanner(System.in);
    int arr[];
    int n;
    public static void main(){
        Q4 q4 = new Q4();
        q4.accept();
        q4.print();
    }
    void accept(){
        System.out.print("Please enter the number of elements: ");
        n = sc.nextInt();
        arr = new int[n];
        for(int i  =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }

    void print(){
        System.out.println(arr[0]);
        System.out.println(arr[n-1]);
    }
}