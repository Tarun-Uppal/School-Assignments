import java.util.*;
public class Q3
{   
    int arr[] = new int[10];
    int arr1[] = new int[10];
    public static void main(){
        Q3 q3 = new Q3();
        q3.accept();
        q3.print();
    }

    void accept(){
        Scanner sc = new Scanner(System.in);
        for(int i  =0; i < 10; i++){
            arr[9-i] = sc.nextInt();
            arr1[i] = arr[9-i];            
        }
    }

    void print(){
        for(int i = 0; i <10; i++){
            System.out.print(arr[i]+ ", ");
        }
        System.out.println("");
        for(int i = 0; i <10; i++){
            System.out.print(arr1[i] + ", ");
        }
    }
}