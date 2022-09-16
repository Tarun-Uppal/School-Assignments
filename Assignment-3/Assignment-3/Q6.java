import java.util.*;
public class Q6
{   
    int arr[] = new int[10];
    int arr1[] = new int[10];
    public static void main(){
        Q6 q6 = new Q6();
        q6.accept();
        q6.print();
    }

    void accept(){
        Scanner sc = new Scanner(System.in);
        for(int i  =0; i < 10; i++){
            arr[i] = sc.nextInt();
            arr1[i] = (int)Math.pow(arr[i], 3);            
        }
    }

    void print(){
        for(int i = 0; i <10; i++){
            System.out.print(arr[i]+ ", ");
        }
        System.out.println("");
        for(int i = 0; i <10; i++){
            System.out.print(arr1[i]+ ", ");
        }
    }
}