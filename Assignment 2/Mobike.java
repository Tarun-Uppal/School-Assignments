import java.util.*;
public class Mobike
{
    String bno, phno, name;
    int days, charge=0;
    void main(){
        Mobike q12 = new Mobike();
        q12.input();
        q12.compute();
        q12.display();
    }
    void compute(){
        int temp = days;
        if(days>=10){
            charge += 2500;
            temp -= 5;
        } 
        if(days>=5){
            charge += 2000;
            temp -= 5;
        }
        charge += (temp*200);
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bike number: ");
        bno = sc.next();
        System.out.print("Phone number: ");
        phno = sc.next();
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Days: ");
        days = sc.nextInt();
    }
    void display(){
        System.out.println("Bike No. Phone No. Name\tNo. of days\tCharge");
        System.out.println(bno + "\t" + phno + "\t"+ name + "\t" +days+ "\t\t"+charge);
    }
}
