import java.util.*;
public class Q14
{
    int arr[] = new int[10];
    int to_find = 0;
    boolean val = false;
    public static void main(){
        Q14 q14 = new Q14();
        q14.accept();
        q14.find();
        q14.print();
    }

    void accept(){
        Scanner sc = new Scanner(System.in);
        for(int i  = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Please enter the number to search for ");
        to_find = sc.nextInt();
    }

    void find(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int low = 0;
        int high = 9;
        while(low != high){
            int mid = (low + high)/2;
            if (to_find == arr[mid]){
                val = true;
                break;
            }else if (to_find < arr[mid]){
                low = mid + 1;
            }else{                
                high = mid - 1;
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