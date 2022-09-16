import java.util.*;
public class Q8
{
    int arr[] = new int[10];
    public static void main() {
        Q8 q8 = new Q8();
        q8.accept();
        q8.sort();
        q8.print();
    }

    public void accept(){
        System.out.println("Enter the elements of the array:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void sort(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void print(){
        System.out.println("Sorted Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}