import java.util.*;
public class Q2
{
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Consumer Number: ");
        int number = sc.nextInt();
        System.out.print("Consumer Name: ");
        String name = sc.next();
        System.out.print("Units consumed: ");
        int units = sc.nextInt();
        Q2 q2 = new Q2();
        int s = q2.cal(units);
        System.out.println("Amount: " + s);
    }
    int cal(int uni){
        int s = 0;
        if(uni<=100){
            s+= uni*1.5;
        } else if(uni<=200) {
            s+= (uni-100)*2.5+(100*1.5);
        } else {
            s+= (uni-200)*3+((100*1.5)+(100*2.5));
        }
        return s;
    }
}
