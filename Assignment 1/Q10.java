import java.util.*;
public class Q10
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1- For all the prime factors of a number\n"
        +"2- For all the multiplication tables from 1 to 10\n"
        +"Please enter your choice");
        int c = sc.nextInt();
        
        switch(c){
            case 1:
            System.out.print("Please enter the number: ");
            int n = sc.nextInt();
            for(int i = 2;i<n;i++){
                if (n%i== 0){
                    boolean hcf = false;
                    for(int j = 2;j<i;j++){
                        if (i%j == 0)
                            hcf = true;
                    }
                    if (hcf == false)
                        System.out.print(i+", ");
                }
            }
            break;
            case 2:
            for (int i = 1; i<=10;i++){
                for (int j = 1; j<=10;j++){
                    System.out.print(i*j + " ");
                }
                System.out.println();
            }
            break;
        }
    }
}
