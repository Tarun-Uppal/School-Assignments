import java.util.*;
public class Q8
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String[] imp = new String[5];
        for (int i = 0;i<5;i++){
            imp[i] = sc.nextLine();
        }
        for(int i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                if (imp[j].charAt(0)>imp[j+1].charAt(0)){
                    String temp = imp[j];
                    imp[j] = imp[j+1];
                    imp[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<5;i++){
            System.out.print(imp[i] +", ");
        }
    }
}
