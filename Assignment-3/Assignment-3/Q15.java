import java.util.*;
public class Q15
{
    
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vehicle No. ");
        int vno = sc.nextInt();
        System.out.print("Hours ");
        int h = sc.nextInt();
        ParkingLot data = new ParkingLot(vno, h);
        data.calculate();
        data.display();
    }
    
    public class ParkingLot {
        int vno;
        int hours;
        double bill;
        ParkingLot(int v, int h){
            vno = v;
            hours = h;
        }
        void calculate(){
            int h = hours;
            bill = 3;
            if (h > 1){
                bill += ((h-1)*1.5); 
            }
        }
        void display(){
            System.out.println("Vehicle No. " + vno);
            System.out.println("Hours " + hours);
            System.out.println("Bill " + bill);
        }
    }
}