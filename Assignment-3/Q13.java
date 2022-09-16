import java.util.*;
public class Q13
{
    int arr[] = new int[10];
    int to_find = 0;
    boolean val = false;
    public static void main(){
        Q13 q13 = new Q13();
        q13.accept();
        q13.find();
        q13.print();
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        for(int i  =0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Please enter the number to search for ");
        to_find = sc.nextInt();
    }
    void find(){
        for(int i  =0; i < 10; i++){
            if (arr[i] == to_find){
               val = true;
              break;
            }
        }
    }
    void print(){
        if (val){
            System.out.println(to_find + " exists in the array");
        } else {
            System.out.println(to_find + " does not exist in the array");
        }
    }
}